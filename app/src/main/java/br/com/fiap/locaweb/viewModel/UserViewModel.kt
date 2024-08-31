package br.com.fiap.locaweb.viewModel

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import br.com.fiap.locaweb.database.dao.AppDb
import br.com.fiap.locaweb.database.dao.EmailDao
import br.com.fiap.locaweb.database.dao.UsuarioDao
import br.com.fiap.locaweb.database.repository.EmailRepository
import br.com.fiap.locaweb.database.repository.UsuarioRepository
import br.com.fiap.locaweb.model.Email
import br.com.fiap.locaweb.model.Usuario
import kotlinx.coroutines.launch

class UserViewModel(application: Application) : AndroidViewModel(application) {
    private val usuarioDao: UsuarioDao = AppDb.getDatabase(application).usuarioDao()
    private val emailDao: EmailDao = AppDb.getDatabase(application).emailDao()

    private val usuarioRepository = UsuarioRepository(usuarioDao)
    private val emailRepository = EmailRepository(emailDao)

    var usuarioLogado: Usuario? by mutableStateOf(null)
        private set

    fun login(email: String, senha: String)  {
        viewModelScope.launch {
            val usuario = usuarioRepository.login(email, senha)
            if (usuario != null) {
                usuarioLogado = usuario
            } else {
               //TODO - Lidar com o erro
            }
        }
    }

    fun getEmails(): List<Email> {
        return usuarioLogado?.let { emailRepository.getEmailsByUsuario(it.email) } ?: emptyList()
    }
}

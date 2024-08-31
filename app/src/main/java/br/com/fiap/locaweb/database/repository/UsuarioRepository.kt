package br.com.fiap.locaweb.database.repository

import br.com.fiap.locaweb.database.dao.UsuarioDao
import br.com.fiap.locaweb.model.Usuario

class UsuarioRepository(private val usuarioDao: UsuarioDao) {

    suspend fun login(email: String, senha: String): Usuario? {
        return usuarioDao.login(email, senha)
    }
}
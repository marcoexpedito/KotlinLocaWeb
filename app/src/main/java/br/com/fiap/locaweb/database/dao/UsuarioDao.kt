package br.com.fiap.locaweb.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.com.fiap.locaweb.model.Usuario

@Dao
interface UsuarioDao {

    @Insert
    suspend fun salvar(usuario: Usuario): Long

    @Query("SELECT * FROM tbl_usuario WHERE email = :email AND senha = :senha")
    fun login(email: String, senha: String): Usuario?
}
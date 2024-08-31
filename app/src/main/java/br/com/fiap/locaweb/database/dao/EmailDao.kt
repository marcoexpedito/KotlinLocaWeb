package br.com.fiap.locaweb.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.com.fiap.locaweb.model.Email

@Dao
interface EmailDao {

    @Insert
    suspend fun salvar(email: Email) : Long

    @Query("SELECT * FROM tbl_email WHERE destinatario = :email")
    fun getEmailsByUsuario(email: String) : List<Email>
}
package br.com.fiap.locaweb.database.repository

import br.com.fiap.locaweb.database.dao.EmailDao
import br.com.fiap.locaweb.model.Email

class EmailRepository(private val emailDao: EmailDao) {
    fun getEmailsByUsuario(email: String): List<Email> {
        return emailDao.getEmailsByUsuario(email)
    }
}
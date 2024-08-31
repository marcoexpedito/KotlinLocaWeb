package br.com.fiap.locaweb.database.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.fiap.locaweb.model.Email
import br.com.fiap.locaweb.model.Usuario
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(entities = [Usuario::class, Email::class], version = 1)
abstract class AppDb : RoomDatabase() {
    abstract fun usuarioDao(): UsuarioDao
    abstract fun emailDao(): EmailDao

    companion object {
        @Volatile
        private var INSTANCE: AppDb? = null

        fun getDatabase(context: Context): AppDb {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDb::class.java,
                    "app_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }

        fun initializeDatabase(context: Context) {
            val database = getDatabase(context)
            val usuarioDao = database.usuarioDao()
            val emailDao = database.emailDao()

            CoroutineScope(Dispatchers.IO).launch {
                val usuario1 = Usuario(email = "user1@example.com", senha = "senha1", nome = "User 1")
                val usuario2 = Usuario(email = "user2@example.com", senha = "senha2", nome = "User 2")
                val usuario3 = Usuario(email = "user3@example.com", senha = "senha3", nome = "User 3")

                usuarioDao.salvar(usuario1)
                usuarioDao.salvar(usuario2)
                usuarioDao.salvar(usuario3)

                val email1 = Email(remetente = "user1@example.com", destinatario = "user2@example.com", assunto = "Olá", corpoEmail = "Tudo bem?")
                val email2 = Email(remetente = "user2@example.com", destinatario = "user1@example.com", assunto = "Re: Olá", corpoEmail = "Sim, e você?")
                val email3 = Email(remetente = "user3@example.com", destinatario = "user1@example.com", assunto = "Reunião", corpoEmail = "Podemos marcar uma reunião?")

                emailDao.salvar(email1)
                emailDao.salvar(email2)
                emailDao.salvar(email3)
            }
        }
    }
}

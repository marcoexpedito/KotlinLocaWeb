package br.com.fiap.locaweb.model

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "tbl_usuario",
    indices = [Index(value = ["email"], unique = true)]
)
data class Usuario(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var email: String = "",
    var senha: String = "",
    var nome: String = ""
)


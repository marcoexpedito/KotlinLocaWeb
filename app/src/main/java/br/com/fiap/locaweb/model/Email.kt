package br.com.fiap.locaweb.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "tbl_email",
    foreignKeys = [
        ForeignKey(
            entity = Usuario::class,
            parentColumns = ["email"],
            childColumns = ["remetente"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Usuario::class,
            parentColumns = ["email"],
            childColumns = ["destinatario"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["remetente"]), Index(value = ["destinatario"])]
)
data class Email(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var remetente: String = "",
    var destinatario: String = "",
    var assunto: String = "",
    var corpoEmail: String = ""
)

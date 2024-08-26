package br.com.fiap.locaweb.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun EnvioEmail(navController: NavHostController) {
    val destinatario = remember { mutableStateOf("") }
    val assunto = remember { mutableStateOf("") }
    val corpo = remember { mutableStateOf("") }
    val keyboardController = LocalSoftwareKeyboardController.current

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Cancelar",
                fontWeight = FontWeight.Medium,
                color = Color(0xFFF30B44),
                fontSize = 17.sp,
                modifier = Modifier.padding(9.dp)
                        .clickable {
                    navController.navigateUp()
                }
            )

            Spacer(modifier = Modifier.padding(15.dp))

            Text(
                text = "Novo E-mail",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = destinatario.value,
                onValueChange = { destinatario.value = it },
                label = { Text("Destinatário") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                keyboardActions = KeyboardActions(onNext = { keyboardController?.hide() })
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = assunto.value,
                onValueChange = { assunto.value = it },
                label = { Text("Assunto") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                keyboardActions = KeyboardActions(onNext = { keyboardController?.hide() })
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = corpo.value,
                onValueChange = { corpo.value = it },
                modifier = Modifier
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth(),
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
                keyboardActions = KeyboardActions(onDone = { keyboardController?.hide() })
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { navController.navigate("primeiraTela") },
                modifier = Modifier.align(Alignment.End),
                colors = ButtonDefaults.buttonColors(Color(0xFFF30B44))
            ) {
                Text(text = "Enviar", color = Color.White)
            }
        }
    }
}

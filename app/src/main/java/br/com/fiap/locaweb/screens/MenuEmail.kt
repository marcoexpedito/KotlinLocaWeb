import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.TextButton
import androidx.compose.ui.platform.LocalConfiguration

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.fiap.locaweb.R
import br.com.fiap.locaweb.components.BottomBox


@Composable
fun MenuEmail(navController: NavHostController) {

    val screenHeight = LocalConfiguration.current.screenHeightDp.dp

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.End
    ) {
        Spacer(
            modifier = Modifier
                .padding(vertical = 20.dp)
        )
        Column {
            Text(
                text = "Editar",
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(end = 20.dp),
                color = Color(0xFFF30B44),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Caixas",
                modifier = Modifier.padding(start = 15.dp),
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.padding(15.dp))

            Button(
                onClick = {navController.navigate("caixaDeEntrada") },
                modifier = Modifier
                    .padding(end = 2.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color(0xFFD9D9D9))
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.centrada),
                    contentDescription = "caixa",
                    Modifier.size(30.dp),
                    tint = Color.Black
                )
                Text(
                    text = " Entrada                                           >",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    textAlign = TextAlign.End
                )
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(
                onClick = { /* */ },
                modifier = Modifier
                    .padding(end = 2.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color(0xFFD9D9D9))
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.estrela),
                    contentDescription = "estrela",
                    Modifier.size(30.dp),
                    tint = Color.Black
                )
                Text(
                    text = " VIP                                                   >",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(
                onClick = { /* Do something when button 3 is clicked */ },
                modifier = Modifier
                    .padding(end = 2.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color(0xFFD9D9D9))
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.rascunho),
                    contentDescription = "rascunho",
                    Modifier.size(30.dp),
                    tint = Color.Black
                )
                Text(
                    text = " Rascunhos                                     >",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Button(
                onClick = { },
                modifier = Modifier
                    .padding(end = 2.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color(0xFFD9D9D9))
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.enviadas),
                    contentDescription = "enviadas",
                    Modifier.size(30.dp),
                    tint = Color.Black
                )
                Text(
                    text = " Enviadas                                         >",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(
                onClick = { },
                modifier = Modifier
                    .padding(end = 2.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color(0xFFD9D9D9))
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.lixo),
                    contentDescription = "lixo",
                    Modifier.size(30.dp),
                    tint = Color.Black
                )
                Text(
                    text = " Lixo                                                 >",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(
                onClick = { },
                modifier = Modifier
                    .padding(end = 2.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color(0xFFD9D9D9))
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.pasta),
                    contentDescription = "arquivadas",
                    Modifier.size(30.dp),
                    tint = Color.Black
                )
                Text(
                    text = " Arquivadas                                     >",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(
                onClick = { /* */ },
                modifier = Modifier
                    .padding(end = 2.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color(0xFFD9D9D9))
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.pasta),
                    contentDescription = "caixa de saída",
                    Modifier.size(30.dp),
                    tint = Color.Black
                )
                Text(
                    text = " Caixa de Saída                               >",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(
                onClick = { /**/ },
                modifier = Modifier
                    .padding(end = 2.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color(0xFFD9D9D9))
            ) {
                Icon(
                painter = painterResource(id = R.drawable.pasta),
                contentDescription = "lixo eletrônico",
                Modifier.size(30.dp),
                tint = Color.Black
            )
                Text(
                    text = " Lixo Eletrônico                               >",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
            Spacer(modifier = Modifier.padding(15.dp))
        }

        Spacer(modifier = Modifier.weight(1f))

        BottomBox(
            text = "Atualizado Há Pouco",
            onButtonClick = { navController.navigate("envioEmail") },
            navController = navController
        )

    }
}

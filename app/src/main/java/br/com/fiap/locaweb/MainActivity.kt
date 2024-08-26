package br.com.fiap.locaweb

import MenuEmail
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.locaweb.databinding.ActivityMainBinding
import br.com.fiap.locaweb.screens.CaixaDeEntrada
import br.com.fiap.locaweb.screens.EnvioEmail
import br.com.fiap.locaweb.screens.TelaLogin

import br.com.fiap.locaweb.ui.theme.LocaWebTheme


class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContent {binding.root
            LocaWebTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LocaWebApp()
                }
            }
        }
    }
}

@Composable
fun LocaWebApp() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "telaLogin") {
        composable("telaLogin") {
            TelaLogin(navController)
        }
        composable("menuEmail") {
            MenuEmail(navController)
        }
        composable("caixaDeEntrada") {
            CaixaDeEntrada(navController)
        }
        composable("envioEmail") {
            EnvioEmail(navController)
        }
    }
}
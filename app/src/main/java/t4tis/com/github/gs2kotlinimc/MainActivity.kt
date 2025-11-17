package t4tis.com.github.gs2kotlinimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import t4tis.com.github.gs2kotlinimc.screens.CalcularIMCScreen
import t4tis.com.github.gs2kotlinimc.screens.EquipeScreen
import t4tis.com.github.gs2kotlinimc.screens.LoginScreen
import t4tis.com.github.gs2kotlinimc.screens.MenuScreen
import t4tis.com.github.gs2kotlinimc.ui.theme.Gs2KotlinImcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Gs2KotlinImcTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                  val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination =  "login"

                    ){
                        composable (route = "login"){
                            LoginScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "menu") {
                            MenuScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "equipe") {
                            EquipeScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "imc") {
                            CalcularIMCScreen(modifier = Modifier.padding(innerPadding), navController)
                        }


                    }


                }
            }
        }
    }
}

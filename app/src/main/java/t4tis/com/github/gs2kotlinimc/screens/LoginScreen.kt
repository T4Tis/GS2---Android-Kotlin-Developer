package t4tis.com.github.gs2kotlinimc.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LoginScreen(modifier: Modifier = Modifier, navController: NavController) {
    var usuario by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }
    var mensagem by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = "LOGIN",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        OutlinedTextField(
            value = usuario,
            onValueChange = {usuario = it},
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Usuário") },
        )

        Spacer(modifier = Modifier.height(16.dp))

        //  Senha
        OutlinedTextField(
            value = senha,
            onValueChange = { senha = it},
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Senha") },
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { if (usuario == "admin" && senha =="123456"){
                navController.navigate("menu")
            } else {
                mensagem = true;
            }
                      },
            colors = ButtonDefaults.buttonColors(Color.White),

        ) {
            Text(
                text = "ENTRAR",
                fontSize = 20.sp,
                color = Color.Green
            )
        }

        Spacer(modifier = Modifier.height(6.dp))

        if (mensagem){
            Text(
                text = "Usuario ou senha invalida"
            )
        }
    }
}
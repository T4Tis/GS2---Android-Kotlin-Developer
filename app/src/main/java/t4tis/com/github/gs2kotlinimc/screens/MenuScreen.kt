package t4tis.com.github.gs2kotlinimc.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MenuScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(12.dp)
    ){
        Text(
            text = "MENU",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
        ){
            //Calculo de imc
            Button(
                onClick = {navController.navigate("imc")}
            ) {
                Text(
                    text = "Calcular IMC"
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            //Equipe
            Button(
                onClick = {navController.navigate("equipe")}
            ) {
                Text(
                    text = "Equipe"
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            //Voltar
            Button(
                onClick = {navController.navigate("login")}
            ) {
                Text(
                    text = "Voltar"
                )
            }

        }
    }

}
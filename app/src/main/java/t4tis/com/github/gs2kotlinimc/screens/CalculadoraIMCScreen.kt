package t4tis.com.github.gs2kotlinimc.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun CalcularIMCScreen(modifier: Modifier = Modifier, navController: NavController) {
    var peso = remember { mutableStateOf("") }
    var altura = remember { mutableStateOf("") }
    var imc = remember { mutableStateOf(0.0) }
    var statusImc = remember { mutableStateOf("") }

    Column (
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Calculadora iMC", fontSize = 20.sp, fontWeight = FontWeight.Bold)

//        OutlinedTextField()
//        OutlinedTextField()
//        OutlinedTextField()
    }
}
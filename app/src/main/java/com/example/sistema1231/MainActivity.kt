package com.example.sistema1231

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.sistema1231.ui.theme.Sistema1231Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Esto activa la pantalla completa
        enableEdgeToEdge()
        setContent {
            Sistema1231Theme {

                //La disposición en columnas muestra los elementos uno encima de otro
                Column (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    Text("Veni, vici, vidi"
                        , style = MaterialTheme.typography.displaySmall
                    );
                    Text("Julio Cesar");
                }

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                )
                {
                    Text("Hola",
                            //style = TextStyle(fontSize = 48.sp)
                            style = MaterialTheme.typography.displayLarge
                        );
                    Button(onClick = {}) {
                        Text("Empezar");
                    }
                }

                //La disposición en caja superpone los elementos uno encima de otro
                Box (
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Text("2024 Todos los derechos reservados")
                }
            }
        }
    }
}
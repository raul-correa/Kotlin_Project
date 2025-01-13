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
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
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
                    modifier = Modifier.fillMaxWidth().padding(top = dimensionResource(R.dimen.space_4)),
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    Text(
                        stringResource(R.string.phrase)
                        , style = MaterialTheme.typography.displaySmall
                    );
                    Text(stringResource(R.string.author));
                }

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                )
                {
                    Text(
                        stringResource(R.string.greeting),
                            //style = TextStyle(fontSize = 48.sp)
                            style = MaterialTheme.typography.displayLarge
                        );
                    Button(onClick = {}) {
                        Text(stringResource(R.string.begin));
                    }
                }

                //La disposición en caja superpone los elementos uno encima de otro
                Box (
                    modifier = Modifier.fillMaxSize().padding(bottom = dimensionResource(R.dimen.space_3)),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Text(stringResource(R.string.copyright))
                }
            }
        }
    }
}
package com.example.sistema1231

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.example.sistema1231.ui.theme.Sistema1231Theme

class BeginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Sistema1231Theme {
                Column(
                    modifier = Modifier.fillMaxSize().padding( all= dimensionResource(R.dimen.space_3)),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                )
                {
                    Text(stringResource(R.string.begin),
                        style = MaterialTheme.typography.displayLarge)

                    Text(
                        stringResource(R.string.begin_text)
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    )
                    {
                        Button(onClick = {
                            startActivity(Intent(this@BeginActivity, TermsActivity::class.java))
                        })
                        {
                            Text(stringResource(R.string.terms))
                        }

                        Button(onClick = {
                            startActivity(Intent(this@BeginActivity, HomeActivity::class.java))
                        })
                        {
                            Text(stringResource(R.string.home))
                        }
                    }


                }


            }
        }
    }
}
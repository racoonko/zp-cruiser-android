package com.racoonko.zpcruiser

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun SafetyScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("BEZPEČNOSŤ NA PRVOM MIESTE", style = MaterialTheme.typography.headlineMedium)

        // Big Red SOS Button
        Button(
            onClick = {
                val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:112"))
                context.startActivity(intent)
            },
            colors = ButtonDefaults.buttonColors(containerColor = androidx.compose.ui.graphics.Color.Red),
            modifier = Modifier.fillMaxWidth().height(80.dp)
        ) {
            Text("🚨 SOS - Zavolať 112", style = MaterialTheme.typography.headlineSmall)
        }

        // Quick Actions
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(onClick = {
                // Send location via SMS (example)
                val smsIntent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("smsto:")
                    putExtra("sms_body", "SOS - som na Zlaté Piesky, pomôžte! Lokácia: https://maps.google.com/?q=48.1847,17.1894")
                }
                context.startActivity(smsIntent)
            }) {
                Text("📍 Poslať polohu")
            }

            Button(onClick = { /* fake quick exit sound or screen flash */ }) {
                Text("🏃 Quick Exit")
            }
        }

        // Safety Tips
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(Modifier.padding(16.dp)) {
                Text("Základné pravidlá:", style = MaterialTheme.typography.titleMedium)
                Text("• Consent je POVINNÝ")
                Text("• Public sex = riziko polície")
                Text("• Použi kondóm + testuj sa pravidelne")
                Text("• Ak sa necítiš dobre — okamžite odíď")
            }
        }
    }
}
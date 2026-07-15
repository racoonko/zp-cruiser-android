package com.racoonko.zpcruiser

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TodayScreen() {
    val reasons = listOf(
        "Dnes je ideálny deň na lov najhrubších kurcov na tráve pri vode. Choď a nájdi si poriadny monster.",
        "Slnečno = plno tvrdých veľkých kokotov v lesíku. Perfektné na rýchlu šuku.",
        "WC pri kempe má dobrú reputáciu — dnes môžeš vycicať poriadny hrubý kurac."
        // more will be added later
    )

    val todayReason = reasons[0]  // simple for now

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Dnešný dôvod ísť na Zlaté Piesky", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = todayReason,
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        Button(onClick = { /* mark as hunting */ }, modifier = Modifier.padding(top = 16.dp)) {
            Text("Idem Lovit Kurce!")
        }
    }
}
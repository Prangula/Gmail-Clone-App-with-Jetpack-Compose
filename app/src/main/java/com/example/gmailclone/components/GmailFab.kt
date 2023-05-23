package com.example.gmailclone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable

fun GmailFab(scrollState: ScrollState){

    if(scrollState.value > 100){

        ExtendedFloatingActionButton(
            text = { Text(text = "Compose", fontSize = 16.sp)},
            onClick = { /*TODO*/ },
            icon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "") }
        , backgroundColor = Color.White
            )

    }else{

        FloatingActionButton(onClick = { /*TODO*/ },
            backgroundColor = Color.White) {

            Icon(imageVector = Icons.Default.Edit, contentDescription = "")

        }

    }
    

    
    
}
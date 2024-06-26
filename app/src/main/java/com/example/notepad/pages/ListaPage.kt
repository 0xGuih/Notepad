package com.example.notepad.pages

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.notepad.ui.theme.NotepadTheme

@Composable
fun ListaPage(modifier: Modifier = Modifier) {
    Text(
        text = "Lista Page",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun ListaPagePreview() {
    NotepadTheme {
        ListaPage()
    }
}
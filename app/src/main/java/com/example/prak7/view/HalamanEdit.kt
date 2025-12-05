package com.example.prak7.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.prak7.view.route.DestinasiEditSiswa
import com.example.prak7.viewmodel.UIStateSiswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditSiswaScreen(
    navigateBack: () -> Unit,
    onNavigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            SiswaTopAppBar(
                title = stringResource(DestinasiEditSiswa.titleRes),
                canNavigateBack = true,
                navigateUp = onNavigateUp
            )
        },
        modifier = modifier
    ) { innerPadding ->
        // Menampilkan Body dengan data dummy/kosong dulu
        EntrySiswaBody(
            uiStateSiswa = UIStateSiswa(),
            onSiswaValueChange = { },
            onSaveClick = { },
            modifier = Modifier.padding(innerPadding)
        )
    }
}
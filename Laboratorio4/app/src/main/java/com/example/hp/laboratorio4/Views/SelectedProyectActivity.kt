package com.example.hp.laboratorio4.Views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.hp.laboratorio4.R
import kotlinx.android.synthetic.main.activity_selected_proyect.*

class SelectedProyectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_proyect)
        //Obtiene los extras del intent
        val title = intent.getStringExtra("Title")
        val URL = intent.getStringExtra("URL")

        proyectTitle.setText(title)
        labView.loadUrl(URL)
    }
}

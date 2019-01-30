package com.example.hp.laboratorio4.Views

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.hp.laboratorio4.R
import kotlinx.android.synthetic.main.activity_proyects.*

class ProyectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyects)

        val intent:Intent=Intent(this, SelectedProyectActivity::class.java)

        val proyectsArray = arrayOf("Laboratorio 2","Laboratorio 3")

        val adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,proyectsArray)

        proyectsListView.adapter=adapter

        //Logica para enviar el URL adecuado a selected proyect Activity
        proyectsListView.onItemClickListener= object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                when(position){
                    0->{
                        intent.putExtra("URL","https://github.com/michelebenveuto/Laboratorio-2-Menu")
                        intent.putExtra("Title","Laboratorio 2")
                        startActivity(intent)
                    }
                    1->{
                        intent.putExtra("URL","https://github.com/michelebenveuto/Laboratorio-3-Contactos")
                        intent.putExtra("Title","Laboratorio 3")
                        startActivity(intent)
                    }
                }
            }
        }
    }
}

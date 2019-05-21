package com.example.ejemplo_recycleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var p=producto("Computador1",20F,10,"Electronico1")
        var p1=producto("Computador2",20F,10,"Electronico2")
        var p2=producto("Computador3",20F,10,"Electronico3")
        var p3=producto("Computador4",20F,10,"Electronico4")
        var p4=producto("Computador5",20F,10,"Electronico5")

        var listaproducto=ArrayList<producto>()
        listaproducto.add(p)
        listaproducto.add(p1)
        listaproducto.add(p2)
        listaproducto.add(p3)
        listaproducto.add(p4)


        recycleproducto.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        var adapter=adapterproducto(listaproducto)
        recycleproducto.adapter=adapter







    }
}

package com.example.movilapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import kotlinx.coroutines.launch
import roomDataBase.Db
import roomDataBase.entity.Producto

class MenuInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_inicio)

        //Inicializar la base de datos
        val room =
            Room.databaseBuilder(this, Db::class.java, "database-tiendita").allowMainThreadQueries()
                .build()

        //Declaramos las variables con los Id correspondientes


        val btn_registrarProducto = findViewById<Button>(R.id.btn_registrarProducto)
        val btn_gestionar = findViewById<Button>(R.id.btn_gestionar)
        val btn_listado = findViewById<Button>(R.id.btn_listado)
        val tv_user = findViewById<TextView>(R.id.tv_user)
        var id:Long = 0


        val mail:String = intent.getStringExtra("user").toString()
        tv_user.setText("Hola Usuario ${mail}")


        btn_registrarProducto.setOnClickListener {
            val intent = Intent (this@MenuInicio,Registrar_producto::class.java)
            intent.putExtra("mail",mail)
            startActivity(intent)
        }

        btn_gestionar.setOnClickListener {
            val intent = Intent (this@MenuInicio,Inventario_todos_los_productos::class.java)
            intent.putExtra("mail",mail)
            startActivity(intent)
        }

        btn_listado.setOnClickListener {
            val intent = Intent (this@MenuInicio,Listado_de_compras::class.java)
            startActivity(intent)
        }

    }
}
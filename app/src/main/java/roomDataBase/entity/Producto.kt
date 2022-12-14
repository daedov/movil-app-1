package roomDataBase.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

class Producto {
    @PrimaryKey(autoGenerate = true)
    var id:Long=0
    var tipos: String? = null
    var nombre: String? = null
    var cantidad: String? = null
    var precio: String? = null
    var fecha: String? = null
    var ubicacion: String? = null
    var user: String? = null

    constructor(
        tipos: String?,
        nombre: String?,
        cantidad: String,
        precio: String,
        fecha: String?,
        ubicacion: String?,
        user: String?
    ) {
        this.tipos = tipos
        this.nombre = nombre
        this.cantidad = cantidad
        this.precio = precio
        this.fecha = fecha
        this.ubicacion = ubicacion
        this.user = user
    }

    override fun toString(): String {
        return "Producto(id=$id, tipos=$tipos, nombre=$nombre, cantidad=$cantidad, precio=$precio, fecha=$fecha, ubicacion=$ubicacion, user=$user)"
    }

}
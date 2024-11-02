package com.aarondeveloper.dilerpos.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Ventas")
data class ventaEntity (
    @PrimaryKey(autoGenerate = true)
    val ventaId: Int? = null,
    val usuarioId: Int? = null,
    val clienteId: Int? = null,
    val productoId: Int? = null,
    val nfc: String? = "",
    val nombreProducto: String? = "",
    val cantidad: Int? = null,
    val precio: Double? = null,
    val fecha: String? = "",
    val total: Double? = null,
    val descuento: Double? = null,
    val metodoPago: String? = "",
    val estadoVenta: String? = "",
)







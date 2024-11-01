package com.aarondeveloper.dilerpos.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.aarondeveloper.dilerpos.data.local.entities.ventaEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface VentaDao {
    @Upsert
    suspend fun save(ventaEntity: ventaEntity)

    @Query("SELECT * FROM Ventas WHERE nombreProducto = :nombreProducto LIMIT 1")
    suspend fun findByNombreProducto(nombreProducto: String): ventaEntity?

    @Query(
        """
        SELECT * 
        FROM Ventas 
        WHERE ventaId = :id
        LIMIT 1
        """
    )
    suspend fun find(id: Int): ventaEntity?

    @Delete
    suspend fun delete(venta: ventaEntity)

    @Query("SELECT * FROM Ventas")
    fun getAll(): Flow<List<ventaEntity>>

}
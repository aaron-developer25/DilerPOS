package com.aarondeveloper.dilerpos.data.repository

import com.aarondeveloper.dilerpos.data.local.dao.VentaDao
import com.aarondeveloper.dilerpos.data.local.entities.ventaEntity
import javax.inject.Inject

class VentaRepository @Inject constructor(
    private val ventaDao: VentaDao
){
    suspend fun save(venta: ventaEntity) = ventaDao.save(venta)

    suspend fun delete(venta: ventaEntity) = ventaDao.delete(venta)

    suspend fun getVenta(id: Int) = ventaDao.find(id)

    fun getAll() = ventaDao.getAll()

}
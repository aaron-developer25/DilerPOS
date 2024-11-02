package com.aarondeveloper.dilerpos.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aarondeveloper.dilerpos.data.local.dao.VentaDao
import com.aarondeveloper.dilerpos.data.local.entities.ventaEntity

@Database(
    entities = [
        ventaEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class DbDilerPos : RoomDatabase() {
    abstract fun ventaDao(): VentaDao
}

package com.aarondeveloper.dilerpos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.room.Room
import com.aarondeveloper.dilerpos.data.local.database.DbDilerPos
import com.aarondeveloper.dilerpos.ui.theme.DilerPOSTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var dbDilerPos: DbDilerPos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dbDilerPos = Room.databaseBuilder(
            applicationContext,
            DbDilerPos::class.java,
            "DbDilerPos.db"
        ).build()

        enableEdgeToEdge()

        setContent {
            DilerPOSTheme() {

            }
        }
    }
}
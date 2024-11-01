package com.aarondeveloper.dilerpos.di

import android.content.Context
import androidx.room.Room
import com.aarondeveloper.dilerpos.data.local.database.DbDilerPos
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Provides
    @Singleton
    fun provideDilerPosDb(@ApplicationContext appContext: Context) =
        Room.databaseBuilder(
            appContext,
            DbDilerPos::class.java,
            "DbDilerPos.db"
        ).fallbackToDestructiveMigration()
            .build()

    @Provides
    @Singleton
    fun provideVentaDao(dbDilerPos: DbDilerPos) = dbDilerPos.ventaDao()

}

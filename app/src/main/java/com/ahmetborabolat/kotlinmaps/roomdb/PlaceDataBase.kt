package com.ahmetborabolat.kotlinmaps.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ahmetborabolat.kotlinmaps.view.model.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDataBase : RoomDatabase() {
    abstract fun PlaceDao(): PlaceDao
}
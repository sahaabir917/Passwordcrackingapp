package com.example.myapplication.AppDb

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [(CommonPassEntity::class)],version = 1)
abstract class appDb : RoomDatabase() {

    abstract fun pass_dao() : password_Dao

}
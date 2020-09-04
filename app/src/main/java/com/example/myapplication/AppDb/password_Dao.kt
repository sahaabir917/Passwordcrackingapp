package com.example.myapplication.AppDb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface password_Dao {
    @Insert
    fun savepass(pass: CommonPassEntity)

    @Query("select * from CommonPassEntity ")
    fun selectall() : List<CommonPassEntity>
}
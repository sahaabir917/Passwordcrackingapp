package com.example.myapplication.AppDb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class CommonPassEntity {

    @PrimaryKey(autoGenerate = true)
    var id : Int = 0

    @ColumnInfo(name = "Password")
    var password : String = ""


}
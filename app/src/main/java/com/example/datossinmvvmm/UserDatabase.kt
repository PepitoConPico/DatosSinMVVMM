package com.example.datossinmvvmm

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.datossinmvvmm.ui.theme.User

@Database(entities = [User::class], version = 1)
abstract class UserDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
}

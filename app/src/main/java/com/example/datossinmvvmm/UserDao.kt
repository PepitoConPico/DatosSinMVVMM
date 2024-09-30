package com.example.datossinmvvmm

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.datossinmvvmm.ui.theme.User

@Dao
interface UserDao {
    @Query("SELECT * FROM User")
    suspend fun getAll(): List<User>

    @Insert
    suspend fun insert(user: User)
}

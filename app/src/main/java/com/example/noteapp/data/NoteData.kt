package com.example.noteapp.data

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.noteapp.model.Note

class NoteDataSource{
    @RequiresApi(Build.VERSION_CODES.O)
    fun loadNotes(): List<Note> {

        return listOf(

            Note(title = "Android Compose", description = "Working on Note app Project"),
            Note(title = "OOP", description = "Learn Oop in c++"),
            Note(title = "Leetcode", description = "Leetcode practice is must for SDE") ,
            Note(title = "DSA", description = "One DSA question a day make interview easy"),
            Note(title = "MVVM", description = "Model view view Model"),
            Note(title = "CapStone", description = "CapStone is final project for resume"),
            Note(title = "Android Engineer", description = "Android Engineer will be best alternative for SDE")


        )
    }
}
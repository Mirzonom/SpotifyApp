package com.example.spotifyapp.data.remote

import com.example.spotifyapp.data.entities.Song
import com.google.firebase.firestore.FirebaseFirestore
import com.example.spotifyapp.other.Constants.SONG_COLLECTIONS
import kotlinx.coroutines.tasks.await
import java.lang.Exception

class MusicDataBase {
    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection =firestore.collection(SONG_COLLECTIONS)

    suspend fun getAllSongs(): List<Song> {  //Возвращает список песен типа Song
        return try {
            songCollection.get().await().toObjects(Song::class.java)
        }catch (e: Exception){
            emptyList()
        }
    }
}
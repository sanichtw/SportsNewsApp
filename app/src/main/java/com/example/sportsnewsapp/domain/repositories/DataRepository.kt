package com.example.sportsnewsapp.domain.repositories

interface DataRepository {
    suspend fun getPostsList()
    suspend fun getPostInfoById()
}
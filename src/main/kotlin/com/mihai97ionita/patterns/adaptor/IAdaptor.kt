package com.mihai97ionita.patterns.adaptor

interface IAdaptor {
    fun getById(id: Int): NewDTO
}
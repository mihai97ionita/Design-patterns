package com.mihai97ionita.patterns.adaptor

class NewDTO(
        val id: String,
        val status: ObjectStatus
)

enum class ObjectStatus{
    ORDINARY,
    SPECIAL,
    DISCONTINUED,
    NONEXISTENT
}
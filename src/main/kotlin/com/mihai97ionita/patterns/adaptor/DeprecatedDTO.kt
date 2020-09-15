package com.mihai97ionita.patterns.adaptor

data class DeprecatedDTO(
        val id: Int,
        val nonSenseField: String,
        val isDisplayable: Boolean,
        val isSpecial: Boolean,
        val isDiscontinued: Boolean
)

//isDisplayable will translate is the object displayable to consumers
//isSpecial will translate in a special object (handle with care)
//isDiscontinued will not deny the displayable of the object, but it will say it discontinued
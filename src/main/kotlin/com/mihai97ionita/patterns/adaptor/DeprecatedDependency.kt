package com.mihai97ionita.patterns.adaptor

object DeprecatedDependency {

    //this will throw Runtime exceptions if element is not found:D
    fun getById(id: Int): DeprecatedDTO{
        return MockDeprecatedDTOProvider
                .deprecatedDTOs
                .first { it.id == id  }
    }
}

object MockDeprecatedDTOProvider {

    val deprecatedDTOs: List<DeprecatedDTO> = listOf(
            DeprecatedDTO(1,"someThingNonSense-1",true,false,true),
            DeprecatedDTO(2,"someThingNonSense-2",false,true,true),
            DeprecatedDTO(3,"someThingNonSense-3",true,true,false),
            DeprecatedDTO(4,"someThingNonSense-4",true,true,true),
            DeprecatedDTO(5,"someThingNonSense-5",true,false,false)
    )
}
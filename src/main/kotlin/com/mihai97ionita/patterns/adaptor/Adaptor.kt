package com.mihai97ionita.patterns.adaptor

import java.util.*

class Adaptor(private val dependency: DeprecatedDependency): IAdaptor{

    override fun getById(id: Int): NewDTO {
        val optional = tryGetById(id)
        if(optional.isEmpty)
            return NewDTO(id.toString(), ObjectStatus.NONEXISTENT)
        val deprecatedDTO = optional.get()
        return toNewDTO(deprecatedDTO)
    }

    private fun tryGetById(id: Int): Optional<DeprecatedDTO> {
        return try {
            Optional.of(dependency.getById(id))
        }catch (e: Exception){
            Optional.empty<DeprecatedDTO>()
        }
    }

    private fun toNewDTO(deprecatedDTO:DeprecatedDTO): NewDTO{
        //TODO rewrite better
        val objectStatus = when{
            !deprecatedDTO.isDisplayable -> ObjectStatus.NONEXISTENT
            deprecatedDTO.isDiscontinued -> ObjectStatus.DISCONTINUED
            deprecatedDTO.isSpecial -> ObjectStatus.SPECIAL
            else -> ObjectStatus.ORDINARY
        }
        return NewDTO(deprecatedDTO.id.toString(),objectStatus)
    }
}
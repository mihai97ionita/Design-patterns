package com.mihai97ionita.patterns.adaptor

import org.assertj.core.api.AssertionsForInterfaceTypes.*
import org.junit.jupiter.api.Test

class AdaptorPatternTest {

    @Test
    fun `calling adaptor on non-existing element will not throw exception and return NONEXISTENT field`(){
        val adaptor = Adaptor(DeprecatedDependency)

        val dto= adaptor.getById(1234567890)

        assertThat(dto.id).isEqualTo("1234567890")
        assertThat(dto.status).isEqualTo(ObjectStatus.NONEXISTENT)
    }

    @Test
    fun `calling adaptor on non-displayable element will return NONEXISTENT field`(){
        val adaptor = Adaptor(DeprecatedDependency)
        val nonDisplayableId = MockDeprecatedDTOProvider.deprecatedDTOs.first { !it.isDisplayable }.id

        val dto= adaptor.getById(nonDisplayableId)

        assertThat(dto.id).isEqualTo("$nonDisplayableId")
        assertThat(dto.status).isEqualTo(ObjectStatus.NONEXISTENT)
    }

    @Test
    fun `calling adaptor on displayable element but not special or not discontinued will return ORDINARY field`(){
        val adaptor = Adaptor(DeprecatedDependency)
        val id = MockDeprecatedDTOProvider.deprecatedDTOs
                .first { it.isDisplayable && !it.isSpecial && !it.isDiscontinued }.id

        val dto= adaptor.getById(id)

        assertThat(dto.id).isEqualTo("$id")
        assertThat(dto.status).isEqualTo(ObjectStatus.ORDINARY)
    }

    @Test
    fun `calling adaptor on displayable element and special but not discontinued will return SPECIAL field`(){
        val adaptor = Adaptor(DeprecatedDependency)
        val id = MockDeprecatedDTOProvider.deprecatedDTOs
                .first { it.isDisplayable && it.isSpecial && !it.isDiscontinued }.id

        val dto= adaptor.getById(id)

        assertThat(dto.id).isEqualTo("$id")
        assertThat(dto.status).isEqualTo(ObjectStatus.SPECIAL)
    }

    @Test
    fun `calling adaptor on displayable element and discontinued will return DISCONTINUED field with special`(){
        val adaptor = Adaptor(DeprecatedDependency)
        val id = MockDeprecatedDTOProvider.deprecatedDTOs
                .first { it.isDisplayable && it.isSpecial && it.isDiscontinued }.id

        val dto= adaptor.getById(id)

        assertThat(dto.id).isEqualTo("$id")
        assertThat(dto.status).isEqualTo(ObjectStatus.DISCONTINUED)
    }

    @Test
    fun `calling adaptor on displayable element and discontinued will return DISCONTINUED field with no special`(){
        val adaptor = Adaptor(DeprecatedDependency)
        val id = MockDeprecatedDTOProvider.deprecatedDTOs
                .first { it.isDisplayable && !it.isSpecial && it.isDiscontinued }.id

        val dto= adaptor.getById(id)

        assertThat(dto.id).isEqualTo("$id")
        assertThat(dto.status).isEqualTo(ObjectStatus.DISCONTINUED)
    }
}
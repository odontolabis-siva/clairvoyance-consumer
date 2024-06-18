package io.odontolabissiva.clairvoyanceservice.domain.user.dto

import io.swagger.v3.oas.annotations.media.Schema

data class UserDto(
    @field:Schema(type = "id", description = "User ID")
    var id: Int,
    // TODO: Add properties below
)

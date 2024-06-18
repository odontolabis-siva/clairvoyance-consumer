package io.odontolabissiva.clairvoyanceservice.domain.gateway.dto

import io.swagger.v3.oas.annotations.media.Schema

data class GatewayDto(
    @field:Schema(type = "id", description = "Gateway ID")
    var id: Int,
    // TODO: Add properties below
)

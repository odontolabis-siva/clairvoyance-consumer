package io.odontolabissiva.clairvoyanceservice.domain.gateway.api

import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Validated
@RestController
@RequestMapping("/api/v1/gateways")
class GatewayApi {
}
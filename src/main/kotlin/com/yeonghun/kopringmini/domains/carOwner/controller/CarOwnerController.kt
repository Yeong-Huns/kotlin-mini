package com.yeonghun.kopringmini.domains.carOwner.controller

import com.yeonghun.kopringmini.domains.car.dto.response.CarResponse
import com.yeonghun.kopringmini.domains.carOwner.dto.response.CarOwnerResponse
import com.yeonghun.kopringmini.domains.carOwner.service.CarOwnerService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *packageName    : com.yeonghun.kopringmini.domains.carOwner.controller
 * fileName       : CarOwnerController
 * author         : Yeong-Huns
 * date           : 2025-03-17
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-17        Yeong-Huns       최초 생성
 */
@RequestMapping("/car-owner")
@RestController
@Tag(name = "CarOwnerController API" , description = "소유 차량 등록/수정/삭제")
class CarOwnerController (
    private val carOwnerService: CarOwnerService
){
    @Operation(summary = "차량 소유자 전체 조회")
    @GetMapping
    fun findAllCarOwners(): ResponseEntity<List<CarOwnerResponse>> =
        ResponseEntity.ok(carOwnerService.findAllCarOwners());

    @Operation(summary = "차량 소유 Id로 등록된 차량과 차량 주인 조회")
    @GetMapping( "/{id}")
    fun findCarOwnerById(@PathVariable id: Long): ResponseEntity<CarOwnerResponse> =
        ResponseEntity.ok(carOwnerService.findCarOwnerById(id))

    @Operation(summary = "특정 유저가 소유한 모든 차량 조회")
    @GetMapping("/{id}/car")
    fun findAllCarsByUserId(@PathVariable id: Long): ResponseEntity<List<CarResponse>> =
        ResponseEntity.ok(carOwnerService.findAllCarsByUserId(id))
}
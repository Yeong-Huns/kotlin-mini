package com.yeonghun.kopringmini.domains.carOwner.service

import com.yeonghun.kopringmini.domains.car.dto.response.CarResponse
import com.yeonghun.kopringmini.domains.carOwner.dto.response.CarOwnerResponse
import com.yeonghun.kopringmini.domains.carOwner.repository.CarOwnerRepository
import com.yeonghun.kopringmini.global.util.findByIdOrThrow
import org.springframework.stereotype.Service

/**
 *packageName    : com.yeonghun.kopringmini.domains.carOwner.service
 * fileName       : CarOwnerService
 * author         : Yeong-Huns
 * date           : 2025-03-17
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-17        Yeong-Huns       최초 생성
 */
@Service
class CarOwnerService (
    private val carOwnerRepository: CarOwnerRepository
){
    fun findAllCarOwners() =
        carOwnerRepository.findAll()
            .map(CarOwnerResponse::fromCarOwner)

    fun findCarOwnerById(id: Long) =
        carOwnerRepository.findByIdOrThrow(id).let(CarOwnerResponse::fromCarOwner)

    fun findAllCarsByUserId(id: Long): List<CarResponse> =
        carOwnerRepository.findAllByUser_Id(id).map{ CarResponse.fromCar(it.car) }
}
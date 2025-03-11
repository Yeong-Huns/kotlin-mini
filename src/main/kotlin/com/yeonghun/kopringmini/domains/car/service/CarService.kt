package com.yeonghun.kopringmini.domains.car.service

import com.yeonghun.kopringmini.domains.car.domain.Car
import com.yeonghun.kopringmini.domains.car.dto.request.CreateCarRequest
import com.yeonghun.kopringmini.domains.car.dto.response.CarResponse
import com.yeonghun.kopringmini.domains.car.repository.CarRepository
import com.yeonghun.kopringmini.global.util.throwExceptions
import org.springframework.stereotype.Service

/**
 *packageName    : com.yeonghun.kopringmini.domains.car.service
 * fileName       : CarService
 * author         : Yeong-Huns
 * date           : 2025-03-11
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-11        Yeong-Huns       최초 생성
 */
@Service
class CarService(private val carRepository: CarRepository) {

    fun saveCar(createCarRequest: CreateCarRequest): Car =
        carRepository.save(createCarRequest.toEntity())


    fun findAll(): List<CarResponse> =
        carRepository.findAll()
            .map(CarResponse::fromCar)


}

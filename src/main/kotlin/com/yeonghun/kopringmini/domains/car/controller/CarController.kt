package com.yeonghun.kopringmini.domains.car.controller

import com.yeonghun.kopringmini.domains.car.dto.response.CarResponse
import com.yeonghun.kopringmini.domains.car.service.CarService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *packageName    : com.yeonghun.kopringmini.domains.car.controller
 * fileName       : CarController
 * author         : Yeong-Huns
 * date           : 2025-03-11
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-11        Yeong-Huns       최초 생성
 */
@RequestMapping("/car")
@RestController
class CarController(
    private val carService: CarService
) {
    @GetMapping
    fun findAllCars(): ResponseEntity<List<CarResponse>> =
        ResponseEntity.ok(carService.findAll())


}
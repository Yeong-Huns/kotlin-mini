package com.yeonghun.kopringmini.domains.car.dto.response

import com.yeonghun.kopringmini.domains.car.domain.Car
import java.time.LocalDateTime

/**
 *packageName    : com.yeonghun.kopringmini.domains.car.dto.response
 * fileName       : CarResponse
 * author         : Yeong-Huns
 * date           : 2025-03-11
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-11        Yeong-Huns       최초 생성
 */
data class CarResponse(
    val brand: String,
    val model: String,
    val color: String,
    val modelYear: Int,
    val price: Int,
    val createdDateTime: LocalDateTime?,
    val modifiedDateTime: LocalDateTime?,
){
    companion object {
        fun fromCar(car: Car): CarResponse {
            return CarResponse(
                brand = car.brand,
                model = car.model,
                color = car.color,
                modelYear = car.modelYear,
                price = car.price,
                createdDateTime = car.createdDateTime,
                modifiedDateTime = car.modifiedDateTime
            )
        }
    }
}

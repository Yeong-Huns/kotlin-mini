package com.yeonghun.kopringmini.domains.car.dto.request

import com.yeonghun.kopringmini.domains.car.domain.Car
import java.time.LocalDate

/**
 *packageName    : com.yeonghun.kopringmini.domains.car.dto.request
 * fileName       : CreateCarRequest
 * author         : Yeong-Huns
 * date           : 2025-03-11
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-11        Yeong-Huns       최초 생성
 */
data class CreateCarRequest(
    val brand: String,
    val model: String,
    val color: String,
    val modelYear: Int,
    val price: Int
) {
    fun toEntity(): Car {
        return Car(
            brand = this.brand,
            model = this.model,
            color = this.color,
            modelYear = this.modelYear,
            price = this.price
        )
    }
}
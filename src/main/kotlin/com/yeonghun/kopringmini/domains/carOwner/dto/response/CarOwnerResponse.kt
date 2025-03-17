package com.yeonghun.kopringmini.domains.carOwner.dto.response

import com.yeonghun.kopringmini.domains.car.domain.Car
import com.yeonghun.kopringmini.domains.car.dto.response.CarResponse
import com.yeonghun.kopringmini.domains.carOwner.domain.CarOwner
import com.yeonghun.kopringmini.domains.user.domain.User
import com.yeonghun.kopringmini.domains.user.dto.response.UserResponse
import java.util.*

/**
 *packageName    : com.yeonghun.kopringmini.domains.carOwner.dto.response
 * fileName       : CarOwnerResponse
 * author         : Yeong-Huns
 * date           : 2025-03-17
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-17        Yeong-Huns       최초 생성
 */
data class CarOwnerResponse(
    val registrationId: UUID,
    val user: UserResponse,
    val car: CarResponse
){
    companion object{
        fun fromCarOwner(carOwner: CarOwner): CarOwnerResponse{
            return CarOwnerResponse(
                registrationId = carOwner.registrationId,
                user = UserResponse.fromUser(carOwner.user),
                car = CarResponse.fromCar(carOwner.car)
            )
        }
    }
}


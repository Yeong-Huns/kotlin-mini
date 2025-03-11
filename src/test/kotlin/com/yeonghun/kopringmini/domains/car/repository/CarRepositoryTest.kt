package com.yeonghun.kopringmini.domains.car.repository

import com.yeonghun.kopringmini.domains.car.domain.Car
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.ActiveProfiles

/**
 *packageName    : com.yeonghun.kopringmini.domains.car.repository
 * fileName       : CarRepositoryTest
 * author         : Yeong-Huns
 * date           : 2025-03-11
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-11        Yeong-Huns       최초 생성
 */
@ActiveProfiles("test")
@DataJpaTest
class CarRepositoryTest (@Autowired val carRepository: CarRepository){
    @DisplayName("생성된 자동차를 저장하는데 성공한다.")
    @Test
    fun test() {
        //given
        val car = Car(
            brand = "BMW",
            model = "G80",
            color = "BLACK",
            modelYear = 2025,
            price = 10000
        )
        val savedCar = carRepository.save(car)

        //when & then
        assertThat(savedCar)
            .extracting("brand", "model", "color", "registrationNumber")
            .containsExactlyInAnyOrder("BMW", "G80", "BLACK", "001");
    }
}
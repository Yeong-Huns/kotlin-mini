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
            registrationNumber = "001",
            modelYear = 2025,
            price = 10000
        )
        val savedCar = carRepository.save(car)

        //when & then
        assertThat(savedCar)
            .extracting("brand", "model", "color", "registrationNumber")
            .containsExactlyInAnyOrder("BMW", "G80", "BLACK", "001");
    }

    @DisplayName("자동차의 등록번호로 차량을 조회하는데 성공한다.")
    @Test
    fun test2() {
        //given
        val registrationNumber = "001"
        val car = Car(
            brand = "BMW",
            model = "G80",
            color = "BLACK",
            registrationNumber = registrationNumber,
            modelYear = 2025,
            price = 10000
        )
        carRepository.save(car)

        //when
        val findCar = carRepository.findByRegistrationNumber(registrationNumber)

        //then
        assertThat(findCar).isEqualTo(car)
    }

    @DisplayName("자동차의 등록번호로 차량을 조회하는데 실패한다.")
    @Test
    fun test3() {
        //given
        val registrationNumber = "001"
        val car = Car(
            brand = "BMW",
            model = "G80",
            color = "BLACK",
            registrationNumber = registrationNumber,
            modelYear = 2025,
            price = 10000
        )
        carRepository.save(car)

        //when
        val findCar = carRepository.findByRegistrationNumber("002")

        //then
        assertThat(findCar).isNull()
    }

    @DisplayName("가장 최근의 registrationNumber 조회에 성공한다.")
    @Test
    fun test4() {
        //given
        val car1 = Car(
            brand = "BMW",
            model = "G80",
            color = "BLACK",
            registrationNumber = "004",
            modelYear = 2025,
            price = 10000
        )
        val car2 = Car(
            brand = "BMW",
            model = "G80",
            color = "BLACK",
            registrationNumber = "008",
            modelYear = 2025,
            price = 10000
        )
        val car3 = Car(
            brand = "BMW",
            model = "G80",
            color = "BLACK",
            registrationNumber = "007",
            modelYear = 2025,
            price = 10000
        )
        val car4 = Car(
            brand = "BMW",
            model = "G80",
            color = "BLACK",
            registrationNumber = "006",
            modelYear = 2025,
            price = 10000
        )
        carRepository.saveAll(listOf(car1,car2,car3,car4))

        //when
        val maxNumber = carRepository.findNextRegistrationNumber();

        //then
        assertThat(maxNumber).isEqualTo("008")
    }
}
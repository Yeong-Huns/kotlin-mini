package com.yeonghun.kopringmini.domains.car.repository

import com.yeonghun.kopringmini.domains.car.domain.Car
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

/**
 *packageName    : com.yeonghun.kopringmini.domains.car.repository
 * fileName       : CarRepository
 * author         : Yeong-Huns
 * date           : 2025-03-11
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-11        Yeong-Huns       최초 생성
 */
@Repository
interface CarRepository: JpaRepository<Car, Long>
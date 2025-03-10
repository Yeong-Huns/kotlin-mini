package com.yeonghun.kopringmini.domains.car.domain

import com.yeonghun.kopringmini.global.config.audit.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

/**
 *packageName    : com.yeonghun.kopringmini.domains.car.domain
 * fileName       : Car
 * author         : Yeong-Huns
 * date           : 2025-03-11
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-11        Yeong-Huns       최초 생성
 */
@Entity
class Car(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val brand: String,
    val model: String,
    val color: String,
    val registrationNumber: String,
    val modelYear: Int,
    val price: Int
) : BaseEntity()
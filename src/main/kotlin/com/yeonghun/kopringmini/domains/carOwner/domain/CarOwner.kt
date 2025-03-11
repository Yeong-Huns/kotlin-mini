package com.yeonghun.kopringmini.domains.carOwner.domain

import com.yeonghun.kopringmini.domains.car.domain.Car
import com.yeonghun.kopringmini.domains.user.domain.User
import jakarta.persistence.*
import java.util.UUID

/**
 *packageName    : com.yeonghun.kopringmini.domains.carOwner.domain
 * fileName       : CarOwner
 * author         : Yeong-Huns
 * date           : 2025-03-11
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-11        Yeong-Huns       최초 생성
 */
@Entity
class CarOwner (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val registrationId: UUID,
    @ManyToOne(fetch = FetchType.LAZY)
    val user: User,
    @ManyToOne(fetch = FetchType.LAZY)
    val car: Car
)
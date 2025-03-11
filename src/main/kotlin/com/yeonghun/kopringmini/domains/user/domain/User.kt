package com.yeonghun.kopringmini.domains.user.domain

import com.yeonghun.kopringmini.global.config.audit.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

/**
 *packageName    : com.yeonghun.kopringmini.domains.user.domain
 * fileName       : User
 * author         : Yeong-Huns
 * date           : 2025-03-11
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-11        Yeong-Huns       최초 생성
 */
@Table(name = "user_info")
@Entity
class User (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val firstname: String,
    val lastname: String,
) : BaseEntity()
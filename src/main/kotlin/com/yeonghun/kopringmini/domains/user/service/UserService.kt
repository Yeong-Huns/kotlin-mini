package com.yeonghun.kopringmini.domains.user.service

import com.yeonghun.kopringmini.domains.user.dto.response.UserResponse
import com.yeonghun.kopringmini.domains.user.repository.UserRepository
import com.yeonghun.kopringmini.global.util.findByIdOrThrow
import org.springframework.stereotype.Service

/**
 *packageName    : com.yeonghun.kopringmini.domains.user.service
 * fileName       : UserService
 * author         : Yeong-Huns
 * date           : 2025-03-17
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-17        Yeong-Huns       최초 생성
 */
@Service
class UserService (
    private val userRepository: UserRepository,
){
    fun findAllUsers(): List<UserResponse> =
        userRepository.findAll().map(UserResponse::fromUser)

    fun findUserById(id: Long): UserResponse =
        userRepository.findByIdOrThrow(id).let(UserResponse::fromUser)
}
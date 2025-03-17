package com.yeonghun.kopringmini.domains.user.dto.response

import com.yeonghun.kopringmini.domains.user.domain.User

/**
 *packageName    : com.yeonghun.kopringmini.domains.user.dto.response
 * fileName       : UserResponse
 * author         : Yeong-Huns
 * date           : 2025-03-17
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-17        Yeong-Huns       최초 생성
 */
data class UserResponse(
    val firstName: String,
    val lastName: String,
) {
    companion object{
        fun fromUser(user: User): UserResponse{
            return UserResponse(
                firstName = user.firstname,
                lastName = user.lastname
            )
        }
    }
}

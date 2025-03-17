package com.yeonghun.kopringmini.domains.user.repository

import com.yeonghun.kopringmini.domains.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 *packageName    : com.yeonghun.kopringmini.domains.user.repository
 * fileName       : UserRepository
 * author         : Yeong-Huns
 * date           : 2025-03-17
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-17        Yeong-Huns       최초 생성
 */
@Repository
interface UserRepository : JpaRepository<User, Long>{
}
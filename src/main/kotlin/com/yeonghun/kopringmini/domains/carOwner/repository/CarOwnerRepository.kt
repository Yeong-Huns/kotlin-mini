package com.yeonghun.kopringmini.domains.carOwner.repository

import com.yeonghun.kopringmini.domains.carOwner.domain.CarOwner
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 *packageName    : com.yeonghun.kopringmini.domains.carOwner.repository
 * fileName       : CarOwnerRepository
 * author         : Yeong-Huns
 * date           : 2025-03-17
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-17        Yeong-Huns       최초 생성
 */
@Repository
interface CarOwnerRepository : JpaRepository<CarOwner, Long>{
    fun findAllByUser_Id(userId: Long): List<CarOwner>
}
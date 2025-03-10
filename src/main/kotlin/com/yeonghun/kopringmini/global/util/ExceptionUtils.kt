package com.yeonghun.kopringmini.global.util

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.findByIdOrNull

/**
 *packageName    : com.yeonghun.kopringmini.global.util
 * fileName       : ExceptionUtils
 * author         : Yeong-Huns
 * date           : 2025-03-11
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-11        Yeong-Huns       최초 생성
 */
fun throwExceptions (message: String): Nothing {
    throw IllegalArgumentException(message)
}

inline fun <reified T, ID> CrudRepository<T, ID>.findByIdOrThrow(id: ID): T {
    return this.findByIdOrNull(id) ?: throw IllegalArgumentException("[${T::class.simpleName}] $id 조회에 실패했습니다.")
}
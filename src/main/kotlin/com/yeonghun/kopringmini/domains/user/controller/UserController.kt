package com.yeonghun.kopringmini.domains.user.controller

import com.yeonghun.kopringmini.domains.user.dto.response.UserResponse
import com.yeonghun.kopringmini.domains.user.service.UserService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *packageName    : com.yeonghun.kopringmini.domains.user.controller
 * fileName       : UserController
 * author         : Yeong-Huns
 * date           : 2025-03-17
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-17        Yeong-Huns       최초 생성
 */
@RestController
@RequestMapping("/user")
@Tag(name = "UserController API", description = "유저 등록, 조회, 수정")
class UserController (
    val userService: UserService
){
    @Operation(summary = "전체 이용자 조회")
    @GetMapping
    fun findAllUsers(): ResponseEntity<List<UserResponse>> =
        ResponseEntity.ok(userService.findAllUsers());

    @Operation(summary = "Id로 이용자 조회")
    @GetMapping( "/{id}")
    fun findUserById(@PathVariable id: Long): ResponseEntity<UserResponse> =
        ResponseEntity.ok(userService.findUserById(id))
}
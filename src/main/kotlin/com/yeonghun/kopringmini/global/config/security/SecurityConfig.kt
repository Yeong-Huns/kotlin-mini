package com.yeonghun.kopringmini.global.config.security

import com.yeonghun.kopringmini.domains.user.domain.QUser.user
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.provisioning.InMemoryUserDetailsManager

/**
 *packageName    : com.yeonghun.kopringmini.global.config.security
 * fileName       : SecurityConfig
 * author         : Yeong-Huns
 * date           : 2025-03-16
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-16        Yeong-Huns       최초 생성
 */
@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    fun userDetailsService(): InMemoryUserDetailsManager {
        val authorities = listOf(SimpleGrantedAuthority("ROLE_USER"))
        val user: UserDetails = User(
            "user",
            passwordEncoder().encode("password"),
            authorities
        )
        return InMemoryUserDetailsManager(user)
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder = BCryptPasswordEncoder()
}
package com.yeonghun.kopringmini.global.config.swagger

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 *packageName    : com.yeonghun.kopringmini.global.config.swagger
 * fileName       : SwaggerConfig
 * author         : Yeong-Huns
 * date           : 2025-03-14
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-14        Yeong-Huns       최초 생성
 */
@Configuration
class SwaggerConfig {
    @Bean
    fun openAPI(): OpenAPI =
        OpenAPI().info(
            Info().title("Kopring Mini API")
                .description("Kopring Mini Documentation")
                .version("1.0")
        )
}
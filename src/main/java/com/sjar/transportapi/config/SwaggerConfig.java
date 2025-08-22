package com.sjar.transportapi.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi webApi() {
        return GroupedOpenApi.builder()
                .group("web-v1")
                .pathsToMatch("/api/web/**")
                .build();
    }

    @Bean
    public GroupedOpenApi mobileApi() {
        return GroupedOpenApi.builder()
                .group("mobile-v1")
                .pathsToMatch("/api/mobile/**")
                .build();
    }
}

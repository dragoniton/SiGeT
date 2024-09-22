package com.example.SiGeT.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    private BuildProperties buildProperties;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Back-end SiGeT")
                        .description("Back-end do SiGeT")
                );
    }

    @Bean
    public GroupedOpenApi apiV1(){
        return GroupedOpenApi.builder()
                .packagesToScan("com.example.SiGeT")
                .displayName("V0.1")
                .group("V0.1")
                .build();
    }
}
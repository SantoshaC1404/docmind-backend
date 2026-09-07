package com.dockmind_backend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Dock Mind Backend")
                                .description("Dock Mind Backend API")
                                .version("1.0")
                                .contact(new Contact()
                                        .name("Dock Mind")
                                        .url("https://github.com/dockmind-backend")
                                )
                );
    }
}

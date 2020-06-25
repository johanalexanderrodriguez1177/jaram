package com.soaint.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

   // Para acceder a swagger: http://localhost:8080/swagger-ui.html#/

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.soaint.controller"))
                .paths(PathSelectors.any())
                .build()
                .tags(new Tag("CHATBOT", "SERVIDOR"))
                .tags(new Tag("ADMIN", "SERVICIOS"));
    }

}

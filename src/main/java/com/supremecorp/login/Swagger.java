package com.supremecorp.login;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by suprememajor on 9/29/21
 */
@Configuration
@EnableSwagger2
public class Swagger {
    public static final Contact SUPPORTED_CONTACTS = new Contact("Major", "https://www.yisafacameroon.org/", "ndipnobertetta@gmail.com");

    @Bean
    public Docket newApi() {
        Set<String> produce = new HashSet<>(List.of("application/json"));
        Set<String> consumes = new HashSet<>(List.of("application/json"));

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .produces(produce)
                .consumes(consumes)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.supremecorp.login"))
                .paths(regex("/api.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("")
                .description("")
                .termsOfServiceUrl("https://www.google.com/search?q=google&oq=google&aqs=chrome..69i57j35i39j69i60l4j69i65l2.3660j0j4&sourceid=chrome&ie=UTF-8")
                .contact(SUPPORTED_CONTACTS)
                .license("The ultimate license")
                .licenseUrl("A link")
                .version("3.0")
                .build();
    }
}

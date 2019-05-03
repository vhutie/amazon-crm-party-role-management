package com.amazon.crm.party.role;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class KeycloakCORSConfiguration {

    @Bean
    public WebMvcConfigurer corsConfiguration() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**")
                        .allowedMethods(HttpMethod.GET.toString(), HttpMethod.POST.toString(),
                                HttpMethod.PUT.toString(), HttpMethod.DELETE.toString(), HttpMethod.OPTIONS.toString())
                        .allowedOrigins("*");
                registry.addMapping("/amazon-crm-party-role-api/**")
                .allowedMethods(HttpMethod.GET.toString(), HttpMethod.POST.toString(),
                        HttpMethod.PATCH.toString(), HttpMethod.DELETE.toString(), HttpMethod.OPTIONS.toString())
                .allowedOrigins("*");
                registry.addMapping("/amazon-crm-party-role-api/**")
                .allowedMethods(HttpMethod.GET.toString(), HttpMethod.POST.toString(),
                        HttpMethod.PATCH.toString(), HttpMethod.DELETE.toString(), HttpMethod.OPTIONS.toString())
                .allowedOrigins("*");
            }
        };
    }
}
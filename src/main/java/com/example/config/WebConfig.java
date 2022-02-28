package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                        "/images/**",
                        "/css/**",
                        "/fonts/**",
                        "/js/**",
                        "/pages/**",
                        "/partials/**",
                        "/scss/**",
                        "/vendors/**",
                        "/libs/**")
                .addResourceLocations(
                        "classpath:/templates/images/",
                        "classpath:/templates/fonts/",
                        "classpath:/templates/js/",
                        "classpath:/templates/pages/",
                        "classpath:/templates/vendors/",
                        "classpath:/templates/scss/",
                        "classpath:/templates/css/",
                        "classpath:/templates/libs/");
    }


}
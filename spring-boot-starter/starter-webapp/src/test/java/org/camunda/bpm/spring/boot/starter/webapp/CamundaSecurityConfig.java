package org.camunda.bpm.spring.boot.starter.webapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CamundaSecurityConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/camunda/static/**")
                        .addResourceLocations("classpath:/static/");
                registry.addResourceHandler("/camunda/static/app/forms/**")
                        .addResourceLocations("classpath:/static/app/forms/");
                //static:app:forms

                registry.addResourceHandler("static:app:forms/**")
                        .addResourceLocations("classpath:/static/app/forms/");
                registry.addResourceHandler("app:forms/**")
                        .addResourceLocations("classpath:/static/app/forms/");

            }
        };
    }

//    @Bean
//    public CustomAuthenticationFilter customAuthenticationFilter() {
//        return new CustomAuthenticationFilter();
//    }
}

package com.uth.ums.enrollment.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class OpenAPIConfig {
//    @Value("${bezkoder.openapi.dev-url}")
//    private String devUrl;
//
//    @Value("${bezkoder.openapi.prod-url}")
//    private String prodUrl;
//
//    @Bean
//    public OpenAPI myOpenAPI() {
//        Server devServer = new Server();
//        devServer.setUrl(devUrl);
//        devServer.setDescription("Server URL in Development environment");
//
//        Server prodServer = new Server();
//        prodServer.setUrl(prodUrl);
//        prodServer.setDescription("Server URL in Production environment");
//
//        Contact contact = new Contact();
//        contact.setEmail("contact@pasanabeysekara.com");
//        contact.setName("Pasan Abeysekara");
//        contact.setUrl("https://www.pasanabeysekara.com");
//
//        License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");
//
//        Info info = new Info()
//                .title("Demo Service API")
//                .version("1.0")
//                .contact(contact)
//                .description("This API exposes endpoints to manage demo.").termsOfService("https://www.pasanabeysekara.com")
//                .license(mitLicense);
//
//        return new OpenAPI().info(info).servers(List.of(devServer, prodServer));
//    }
}

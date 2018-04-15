package com.betterjavacode.socialpie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author - Yogesh Mali
 */
@EnableCaching
@EnableSwagger2
@SpringBootApplication(scanBasePackages = {"com.betterjavacode.socialpie"})
public class SocialpieApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SocialpieApplication.class, args);
    }

    /**
     * @return Docket
     */
    @Bean
    public Docket socialPieApi()
    {
        return new Docket(DocumentationType.SWAGGER_2).groupName("socialpie")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/");
    }

    /**
     * @return ApiInfo
     */
    private ApiInfo apiInfo()
    {
        return new ApiInfoBuilder().title("Social Pie REST Service")
                .description("A Simple REST Service for Social Pie Software")
                .contact(new Contact("Yogesh Mali", "https://betterjavacode.com", ""))
                .version("1.0")
                .build();
    }
}

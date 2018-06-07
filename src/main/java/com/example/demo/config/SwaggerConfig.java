package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @ClassName: SwaggerConfig
 * @Description: Swagger配置
 * @author: hjh
 * @date: 2018年3月28日 11:15:01
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /*@Value("${spring.profiles.active}")
    private String evn;*/

    @Bean
    public Docket buildDocket() {
        //指定环境不显示接口文档
        /*if ("prod".equals(evn)) {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(displayBlank())
                    .select()
                    .paths(PathSelectors.none())
                    .build();
        }*/
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                .select()
                //要扫描的API(Controller)基础包
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title("项目接口文档")
                .contact(new Contact("wyh", "", "445906339@qq.com"))
                .version("1.0")
                .build();
    }

    /**
     * 返回空白页
     *
     * @return
     */
    private ApiInfo displayBlank() {
        return new ApiInfoBuilder()
                .title("")
                .description("")
                .license("")
                .licenseUrl("")
                .termsOfServiceUrl("")
                .version("")
                .contact(new Contact("", "", ""))
                .build();
    }
}

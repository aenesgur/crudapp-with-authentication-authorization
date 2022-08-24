package com.aenesgur.crudappwithauth;

import com.aenesgur.crudappwithauth.configuration.SecurityConfig;
import com.aenesgur.crudappwithauth.configuration.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@Import( { SecurityConfig.class, SwaggerConfig.class } )
public class CrudappWithAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudappWithAuthApplication.class, args);
	}

}

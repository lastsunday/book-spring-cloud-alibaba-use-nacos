package com.github.lastsunday.cloud;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(value="com.github.lastsunday.cloud")
@EnableDubbo
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

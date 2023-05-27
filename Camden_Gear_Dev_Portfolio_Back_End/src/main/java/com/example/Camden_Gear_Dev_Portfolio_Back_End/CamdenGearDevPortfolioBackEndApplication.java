package com.example.Camden_Gear_Dev_Portfolio_Back_End;

import com.example.Camden_Gear_Dev_Portfolio_Back_End.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class CamdenGearDevPortfolioBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamdenGearDevPortfolioBackEndApplication.class, args);
	}

}

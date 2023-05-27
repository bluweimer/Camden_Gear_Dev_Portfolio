package com.example.Camden_Gear_Dev_Portfolio_Back_End.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@ConfigurationProperties(prefix = "rsa")

public record RsaKeyProperties(RSAPublicKey publicKey, RSAPrivateKey privateKey) {


}

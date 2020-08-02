package com.java.filecontrol;

import com.java.filecontrol.configuration.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class SpringBootFileControlApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootFileControlApplication.class, args);
  }
}

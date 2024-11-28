package com.CoolBabiesDoulaServicesMonitor.SystemHeartBeat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SystemHeartBeatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemHeartBeatApplication.class, args);
	}

}

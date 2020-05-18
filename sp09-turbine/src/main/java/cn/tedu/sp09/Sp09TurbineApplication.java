package cn.tedu.sp09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
@EnableDiscoveryClient
@EnableTurbine
@SpringBootApplication
public class Sp09TurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp09TurbineApplication.class, args);
	}

}

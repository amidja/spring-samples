package org.amidja.home.demo.coffee;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ReactiveRedisApplication implements ApplicationRunner{

	
	public static void main(String[] args) {
		SpringApplication.run(ReactiveRedisApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
//		log.info("in application runner calling: curl http://localhost:8080/coffees ");
//		
//		WebClient webClient = WebClient.builder()
//				  .baseUrl("http://localhost:8080").build();
//		
//		Coffee firstCoffee = webClient.get()
//				.uri("/coffees").retrieve().bodyToFlux(Coffee.class)
//				.blockFirst();
//		
//		log.info("{}", firstCoffee);
	}	
}

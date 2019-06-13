package com.example.demo;

import com.example.demo.domain.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.domain.CarInfo;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CarRepository repository){
        return args -> {
        //save a couple cusomters
        repository.save(new CarInfo("Toyota", "4Runner"));
        repository.save(new CarInfo("Honda", "Civic"));
        repository.save(new CarInfo("Jeep", "Grand Cherokee"));
        repository.save(new CarInfo("Tesla", "Model 3"));
        repository.save(new CarInfo("Ford", "Fusion"));

        //read all cars
        log.info("Cars found with findAll():");
        log.info("-------------------------------");
        for (CarInfo car : repository.findAll()) {
            log.info(car.toString());
        }
        log.info("");

        //read an individual car by ID
        repository.findById(1L)
                .ifPresent(car -> {
                    log.info("Car found with findById(1L):");
                    log.info("---------------------------------");
                    log.info(car.toString());
                    log.info("");
                });
        //read cars by model
        log.info("Car found with findbyCarModel('4Runner')");
        log.info("---------------------------------------");
        repository.findByCarModel("4Runner").forEach((bauer ->{
            log.info(bauer.toString());
        }));
        };
    }
    }

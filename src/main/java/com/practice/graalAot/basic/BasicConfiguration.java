package com.practice.graalAot.basic;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.repository.CrudRepository;

import java.util.stream.Stream;

interface CustomerRepository extends CrudRepository<Customer, Integer> {

}

@Configuration
public class BasicConfiguration {

    @Bean
    ApplicationListener<ApplicationReadyEvent> basicApplicationListner(CustomerRepository repository) {

        return new ApplicationListener<ApplicationReadyEvent>() {
            @Override
            public void onApplicationEvent(ApplicationReadyEvent event) {
                repository.saveAll(
                                Stream.of("A", "B", "C")
                                        .map(name -> {
                                            return new Customer(null, name);
                                        })
                                        .toList()
                        )
                        .forEach(System.out::println);
            }
        };
    }
}

record Customer(@Id Integer id, String name) {
}

package com.virtualcodemonkeys.series2project1;

import com.virtualcodemonkeys.series2project1.repos.SuperCharacterRepo;
import com.virtualcodemonkeys.series2project1.repos.SuperGroupRepo;
import com.virtualcodemonkeys.series2project1.resolvers.Mutation;
import com.virtualcodemonkeys.series2project1.resolvers.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Series2Project1Application {

    @Autowired
    SuperCharacterRepo superCharacterRepo;

    @Autowired
    SuperGroupRepo superGroupRepo;

    public static void main(String[] args) {
        SpringApplication.run(Series2Project1Application.class, args);
    }

    @Bean
    public Query query() {
        return new Query(superCharacterRepo, superGroupRepo);
    }

    @Bean
    public Mutation mutation() {
        return new Mutation(superCharacterRepo, superGroupRepo);
    }

}

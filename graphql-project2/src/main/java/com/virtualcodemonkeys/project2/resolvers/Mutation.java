package com.virtualcodemonkeys.project2.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.virtualcodemonkeys.project2.models.SuperCharacter;
import com.virtualcodemonkeys.project2.repos.SuperCharacterRepo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mutation implements GraphQLMutationResolver {
    private SuperCharacterRepo characterRepo;

    public Mutation(SuperCharacterRepo repo){
        this.characterRepo = repo;
    }

    public SuperCharacter addCharacter(String name, Integer age){
        return characterRepo.addCharacter(name, age);
    }

}

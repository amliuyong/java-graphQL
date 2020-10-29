package com.virtualcodemonkeys.series2project1.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.virtualcodemonkeys.series2project1.models.Orientation;
import com.virtualcodemonkeys.series2project1.models.SuperCharacter;
import com.virtualcodemonkeys.series2project1.models.SuperGroup;
import com.virtualcodemonkeys.series2project1.repos.SuperCharacterRepo;
import com.virtualcodemonkeys.series2project1.repos.SuperGroupRepo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mutation implements GraphQLMutationResolver {
    private final SuperCharacterRepo characterRepo;
    private SuperGroupRepo superGroupRepo;

    public Mutation(SuperCharacterRepo repo, SuperGroupRepo superGroupRepo) {

        this.characterRepo = repo;
        this.superGroupRepo = superGroupRepo;
    }

    public SuperCharacter addCharacter(String name, Integer age, String groupName) {
        return characterRepo.addCharacter(name, age, groupName);
    }

    public SuperGroup addGroup(String name, Orientation orientation) {
        return superGroupRepo.addGroup(name, orientation);
    }

}

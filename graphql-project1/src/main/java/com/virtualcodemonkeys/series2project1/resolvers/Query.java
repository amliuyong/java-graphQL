package com.virtualcodemonkeys.series2project1.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.virtualcodemonkeys.series2project1.models.SuperCharacter;
import com.virtualcodemonkeys.series2project1.models.SuperGroup;
import com.virtualcodemonkeys.series2project1.repos.SuperCharacterRepo;
import com.virtualcodemonkeys.series2project1.repos.SuperGroupRepo;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Query implements GraphQLQueryResolver {

    private SuperCharacterRepo superCharacterRepo;

    private SuperGroupRepo superGroupRepo;

    public Query(SuperCharacterRepo repo, SuperGroupRepo superGroupRepo) {
        this.superCharacterRepo = repo;
        this.superGroupRepo = superGroupRepo;
    }

    public List<SuperCharacter> characters() {
        return superCharacterRepo.getCharacters();
    }

    public SuperCharacter characterById(String id) {
        return superCharacterRepo.getCharacterById(id);
    }

    public List<SuperGroup> groups() {
        return  superGroupRepo.getGroups();
    }
    public SuperGroup groupByName(String name) {
      return   superGroupRepo.getGroupByName(name);
    }

}

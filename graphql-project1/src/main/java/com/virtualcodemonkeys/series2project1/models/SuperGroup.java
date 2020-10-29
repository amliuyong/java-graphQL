package com.virtualcodemonkeys.series2project1.models;

import groovy.util.logging.Slf4j;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Builder
@Data
@ToString
public class SuperGroup {
    private String name;
    private Orientation orientation;
    private List<SuperCharacter> members;

    public void addCharacter(SuperCharacter character) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }

        if (character!= null) {
            this.members.add(character);
        }
    }

    public void removeCharacter(SuperCharacter character) {
        if (this.members == null) {
            return;
        }
        this.members = this.members.stream().filter(c -> c.getName().equalsIgnoreCase(character.getName())).collect(Collectors.toList());

    }
}

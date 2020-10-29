package com.virtualcodemonkeys.series2project1.repos;

import com.virtualcodemonkeys.series2project1.models.Orientation;
import com.virtualcodemonkeys.series2project1.models.SuperGroup;
import groovy.util.logging.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class SuperGroupRepo {
    private List<SuperGroup> theGroups = new ArrayList<>();

    public SuperGroupRepo() {
        seedGroups();
    }

    private void seedGroups() {
        SuperGroup g1 = SuperGroup.builder().name("Group 1").orientation(Orientation.VILLAIN).build();
        this.theGroups.add(g1);
    }

    public List<SuperGroup> getGroups() {
        return theGroups;
    }

    public SuperGroup addGroup(String name, Orientation orientation) {
        SuperGroup g1 = SuperGroup.builder().name(name).orientation(orientation).build();
        this.theGroups.add(g1);
        return g1;
    }

    public SuperGroup getGroupByName(String name) {
        return this.theGroups.stream().filter(g -> g.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}

package com.virtualcodemonkeys.series2project1.models;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
@ToString
public class SuperCharacter {

    private String id;
    private String name;
    private Integer age;
    private SuperGroup group;

}

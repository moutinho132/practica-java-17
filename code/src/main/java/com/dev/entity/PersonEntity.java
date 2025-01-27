package com.dev.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PersonEntity {
    public String name;
    public int age;
}

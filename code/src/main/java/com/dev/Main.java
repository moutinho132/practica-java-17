package com.dev;

import com.dev.dto.PersonDto;
import com.dev.mapper.PersonMapper;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<String>  names = List.of("John", "Paul", "George", "Ringo", "Pete", "Stuart","Pablo");
        List<PersonDto> personDtos = new ArrayList<>();
        PersonDto personDto = null;


       // System.out.println(persons.size());
        personDtos.stream().forEach(System.out::println);


    }
}

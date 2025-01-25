package com.dev;

import com.dev.modelo.Persona;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Persona> personaList = Arrays.asList(
                new Persona("John", 30),
                new Persona("Fernando", 30),
                new Persona("John", 30)
        );


        List<String> names = Arrays.asList("Java","Php","JavaScripts","Java");

        for (int i = 0;names.size() > i;i++) {
            System.out.println(names.get(i));
        }
        System.out.println("Length of the list: " + names.size());

        names.forEach(name -> {
            System.out.println(name);
        });
        System.out.println("List after removing duplicates:");
        names.stream().distinct().forEach(name -> {
            System.out.println(name);
        });
        System.out.println("List after sorting:");
        names.stream().sorted().forEach(name -> {
            System.out.println(name);
        });
        System.out.println("List after reversing:");
        names.stream().sorted((name1, name2) -> name2.compareTo(name1)).forEach(name -> {
            System.out.println(name);
        });

        names.stream().filter(name -> name.startsWith("J")).forEach(name -> {
            System.out.println(name);
        });

        //Recorro la lista de personas
        for (int i = 0;personaList.size() > i;i++) {
            System.out.println(personaList.get(i).nombre());
        }

        Object obj = "Hola Java";
        switch (obj) {
            case String s -> System.out.println("Es un String con valor: " + s);
            case Integer i -> System.out.println("Es un Integer con valor: " + i);
            default -> System.out.println("No reconocido");
        }

    }
}
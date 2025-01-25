package com.dev.adaptador;

public final class Cat extends com.dev.modelo.Animal implements com.dev.adaptador.Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a cat and my name is " );
    }

    @Override
    public String getName() {
        return "Saludos";
    }
}

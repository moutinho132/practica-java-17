package com.dev.adaptador;

public final class Dog extends com.dev.modelo.Animal implements com.dev.adaptador.Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a dog and my name is ");
    }

    @Override
    public String getName() {
        return "";
    }
}

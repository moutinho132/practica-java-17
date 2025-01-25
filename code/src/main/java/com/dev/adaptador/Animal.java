package com.dev.adaptador;

public sealed interface Animal permits Cat, Dog {
    void sayHello();
    String getName();
}

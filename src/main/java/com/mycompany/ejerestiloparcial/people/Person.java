package com.mycompany.ejerestiloparcial.people;

public class Person {

    private String name;
    private String lastname;
    private int age;
    private String id;
    private TypePerson type;

    public Person(String name, String lastname, int age, String id, TypePerson type) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.id = id;
        this.type = type;
    }

    public Person(TypePerson type) {
        this.type = type;
    }
    
}

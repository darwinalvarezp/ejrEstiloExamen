package com.mycompany.ejerestiloparcial.people.coach;

import com.mycompany.ejerestiloparcial.people.Person;
import com.mycompany.ejerestiloparcial.people.TypePerson;
import com.mycompany.ejerestiloparcial.sportCenter.Sport;

public class Coach extends Person {

    private Sport sport;
    private boolean available = true;
    private TypePerson type;

    public Coach(String name, String lastname, int age, String id) {
        super(name, lastname, age, id,TypePerson.COACH);
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public boolean isAvailable() {
        return available;
    }

    public TypePerson getType() {
        return type;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

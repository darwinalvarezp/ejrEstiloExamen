package com.mycompany.ejerestiloparcial.people.Sportsman;

import com.mycompany.ejerestiloparcial.people.Person;
import com.mycompany.ejerestiloparcial.people.TypePerson;
import com.mycompany.ejerestiloparcial.sportCenter.Sport;

public class Sportsman extends Person implements Doping, Feeding {

    private Sport sport;

    public Sportsman(String name, String lastname, int age, String id, Sport sport) {
        super(name, lastname, age, id, TypePerson.SPORTSMAN);
        this.sport = sport;
    }

    @Override
    public void doTest() {
        System.out.println("deve hacer prueva de sangre");
    }

    @Override
    public void diet() {
        if (this.sport == Sport.FOOTBALL) {
            System.out.println("dieta de fulvo");
        } else if (this.sport == Sport.BASKETBALL) {
            System.out.println("dieta de basketball");
        } else if (this.sport == Sport.TENNIS) {
            System.out.println("dieta de tennis");
        }

    }

}

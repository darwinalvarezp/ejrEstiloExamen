package com.mycompany.ejerestiloparcial.sportCenter;

import com.mycompany.ejerestiloparcial.people.TypePerson;
import java.util.ArrayList;
import java.util.List;

public class SportCenter {

    private String name;
    private String location;
    private String schedule;
    
    private ArrayList<Scenary> acenaries = new ArrayList<>();
    
    public SportCenter(String name, String location, String schedule) {
        this.name = name;
        this.location = location;
        this.schedule = schedule;
    }
    
    public void AddScenary(Scenary scenary) {
        this.acenaries.add(scenary);
    }
    
    public void reservScenary(TypePerson type, Scenary scenary) throws Exception {
        if (type == TypePerson.COACH || type == TypePerson.SPORTSMAN) {
            int index = this.acenaries.indexOf(scenary);
            if (index != -1) {
                Scenary sc = this.acenaries.get(index);
                if (sc.isAvailable()) {
                    sc.setAvailable(false);
                }else{
                    throw new Exception("el escenario no esta disponible");
                }
            }
        }
    }
}

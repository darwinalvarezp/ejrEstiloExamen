package com.mycompany.ejerestiloparcial;

import com.mycompany.ejerestiloparcial.people.TypePerson;
import com.mycompany.ejerestiloparcial.people.coach.Coach;
import com.mycompany.ejerestiloparcial.sportCenter.Scenary;
import com.mycompany.ejerestiloparcial.sportCenter.Sport;
import com.mycompany.ejerestiloparcial.sportCenter.SportCenter;

public class EjerEstiloParcial {

    public static void main(String[] args) {
       SportCenter sportCenter = new SportCenter("megaparque","ocaa","todo el dia");
       
       Scenary scenary = new Scenary("poli deportivo",Sport.FOOTBALL,200);
      
       
       sportCenter.AddScenary(scenary);
       
       Coach coach = new Coach("pepe","pig",8,"adst");
       try{
           sportCenter.reservScenary(coach.getType(), scenary);
       }catch(Exception ex){
           System.out.println(ex.getMessage());
       }
    }
}

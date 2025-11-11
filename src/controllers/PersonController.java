package controllers;

import models.Person;

public class PersonController {

    public void sortByName(Person[] personas){
        for (int i = 0; i < personas.length-1; i++) {
            for (int j = i+1; j < personas.length; j++) {
                if (personas[i].getName().compareTo(personas[j].getName())>0) {
                    Person temp=personas[i];
                    personas[i]=personas[j];
                    personas[j]=temp;
                }
            }
        }
    }
    
}

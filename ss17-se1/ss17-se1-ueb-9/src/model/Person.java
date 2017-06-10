package model;

import java.util.Observable;

/**
 * Description: Person Model mit Observer-Pattern
 * Project: ss17-se1-ueb-9
 * Package: model
 * Write in: IntelliJ IDEA
 * Created by WeiqiKONG on 17/6/2.
 */
public class Person extends Observable {
    public String name;
    public String vorname;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
        setChanged();
    }


}

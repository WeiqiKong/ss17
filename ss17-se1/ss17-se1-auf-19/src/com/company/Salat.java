package com.company;

import java.util.Vector;

/**
 * Description: Salat ist noch ein Teilgericht
 * Project: ss17-se1-auf-19
 * Package: com.company
 * Write in: IntelliJ IDEA
 * Created by WeiqiKONG on 17/6/9.
 */
public class Salat extends TeilGericht {

    Vector<TeilGericht> gerichts = new Vector<>();


    @Override
    public int berechneKalorien() {
        int kalorien = 0;

        for (int i = 0; i < gerichts.size(); i++) {
            kalorien += gerichts.elementAt(i).berechneKalorien();
        }


        return kalorien;
    }



    @Override
    public void add(TeilGericht teilGericht) {
        gerichts.add(teilGericht);
    }

    @Override
    public void remove(TeilGericht teilGericht) {
        gerichts.remove(teilGericht);
    }

}

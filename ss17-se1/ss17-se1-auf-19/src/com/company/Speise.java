package com.company;

import com.sun.xml.internal.ws.api.wsdl.writer.WSDLGenExtnContext;

import java.util.Vector;

/**
 * Description:
 * Project: ss17-se1-auf-19
 * Package: com.company
 * Write in: IntelliJ IDEA
 * Created by WeiqiKONG on 17/6/9.
 */
public class Speise extends TeilGericht{

    Vector<TeilGericht> childern;

    @Override
    public int berechneKalorien() {
        int kalorien = 0;

        for (int i = 0; i < childern.size(); i++) {
            kalorien+=childern.elementAt(i).berechneKalorien();
        }
        return kalorien;
    }

    @Override
    public void add(TeilGericht teilGericht) {
        childern.add(teilGericht);
    }

    @Override
    public void remove(TeilGericht teilGericht) {
        childern.remove(teilGericht);
    }

    public Speise() {
        childern = new Vector<>();
    }
}

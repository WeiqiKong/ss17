import model.Person;
import swing.PersonFrame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Person p=new Person();
                PersonFrame f = new PersonFrame("PersonFrame",p);
            }
        });
    }
}

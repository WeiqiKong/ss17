package swing;

import model.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

/**
 * Description: Java Swing für Observer-Pattern
 * Project: ss17-se1-ueb-9
 * Package: swing
 * Write in: IntelliJ IDEA
 * Created by WeiqiKONG on 17/6/2.
 */
public class PersonFrame extends JFrame implements Observer {
    public static int FRAME_COUNT = 1;
    Person myPerson = new Person();

    JTextField vornamejtf;
    JTextField namejtf;


    public PersonFrame(String title, Person p) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(600, 100);

        //add Observer
        myPerson = p;
        myPerson.addObserver(this);


        //add a new Panel
        JPanel jpl = new JPanel();
        jpl.setLayout(new GridLayout(3, 3));

        //left page
        JLabel vornameLabel = new JLabel("vorname");
        jpl.add(vornameLabel);

        JLabel nameLabel = new JLabel("name");
        jpl.add(nameLabel);

        vornamejtf = new JFormattedTextField();
        vornamejtf.setColumns(10);
        jpl.add(vornamejtf);

        namejtf = new JFormattedTextField();
        namejtf.setColumns(10);
        jpl.add(namejtf);

        //SaveButton
        JButton savebt = new JButton("save");
        savebt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPerson();
                myPerson.notifyObservers();
            }
        });
        jpl.add(savebt);


        //NewDIalog Button, wenn man ein mal klickt, erzeugt ein neues Fenster
        JButton newDialogbt = new JButton("New Dialog");
        newDialogbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FRAME_COUNT++;
                PersonFrame f = new PersonFrame("PersonFrame" + FRAME_COUNT, p);
            }
        });
        jpl.add(newDialogbt);


        getContentPane().add(jpl);
        this.setVisible(true);
    }


    @Override
    public void update(Observable o, Object arg) {
        getPerson();
    }

    public void getPerson() {
        vornamejtf.setText(myPerson.getVorname());
        namejtf.setText(myPerson.getName());
    }

    public void setPerson() {
        myPerson.setName(namejtf.getText());
        myPerson.setVorname(vornamejtf.getText());
    }


}

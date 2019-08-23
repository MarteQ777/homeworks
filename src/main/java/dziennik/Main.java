package dziennik;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student01 = new Student(new ArrayList<>(Arrays.asList(3.5, 3.5, 4.5, 3.0, 5.0, 2.5)), "001", "Pierwszy", "Szewczyk");
        Student student02 = new Student(new ArrayList<>(Arrays.asList(3.5, 3.5, 4.5, 3.0, 5.0, 2.5)), "002", "Drugi", "Pierdziszewski");
        Student student03 = new Student(new ArrayList<>(Arrays.asList(2.5, 3.5, 4.5, 3.0, 5.0, 2.5)), "003", "Trzeci", "Pierdziszewski");
        Student student04 = new Student(new ArrayList<>(Arrays.asList(3.5, 3.5, 2.5, 3.0, 2.0, 2.5)), "004", "Czwarty", "Pierdziszewski");
        Student student05 = new Student(new ArrayList<>(Arrays.asList(2.5, 2.5, 2.5, 3.0, 2.0, 2.5)), "005", "Piąty", "Pierdziszewski");

        System.out.println(student01.toString());

        Dziennik dziennik = new Dziennik();

        dziennik.dodajStudenta(student01);
        dziennik.dodajStudenta(student02);
        dziennik.dodajStudenta(student03);
        dziennik.dodajStudenta(student04);
        dziennik.dodajStudenta(student05);
        System.out.println("---------------------");
        dziennik.posortujStudentowPoIndexie();
        System.out.println("___________________________");
        dziennik.podajStudentowZagrozonych();


    }


}



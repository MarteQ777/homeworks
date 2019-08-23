package dziennik;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Dziennik {

    Map<String, Student> mapaStudentow = new HashMap<>();

    public Map<String, Student> getMapaStudentow() {
        return mapaStudentow;
    }

    public void dodajStudenta(Student student) {
        mapaStudentow.put(student.getNrIndexu(), student);
        System.out.println("Dodano studenta " + student.toString());
    }

    public void usunStudenta(String nrIndexu) {
        if (mapaStudentow.containsKey(nrIndexu)) {
            mapaStudentow.remove(nrIndexu);
            System.out.println("Student został usunięty z dziennika");
        } else {
            System.out.println("W dzienniku nie znaleziono takiego studenta.");
        }
    }

    public Student zwrocStudenta(String nrIndexu) {
        if (mapaStudentow.containsKey(nrIndexu)) {
            return mapaStudentow.get(nrIndexu);
        } else {
            return null;
        }

    }
    public double podajStredniaOcenStudenta(String nrIndexu){
        double sredniaOcen = 0;
        if(mapaStudentow.containsKey(nrIndexu)){
            sredniaOcen = mapaStudentow.get(nrIndexu)
                                                .getListaOcen()
                                                    .stream()
                                                    .mapToDouble(Double::doubleValue)
                                                    .average()
                                                    .getAsDouble();
            return sredniaOcen;
        }
        else {
            return 0;
        }
    }
    public List<Student> posortujStudentowPoIndexie(){
        List<Student> listaPosortowanych = mapaStudentow.values()
                                                        .stream()
                                                        .sorted(Comparator.comparing(Student::getNrIndexu))
                                                        .collect(Collectors.toList());

        for (int i = 0; i < listaPosortowanych.size(); i++) {
            System.out.println(listaPosortowanych.toArray()[i].toString());

        }
        return listaPosortowanych;
    }

  public List<Student> podajStudentowZagrozonych(){
      List<Student> studenciZagrozeni = mapaStudentow.values()
                                                      .stream()
                                                      .filter(Student -> podajStredniaOcenStudenta(Student.getNrIndexu())<3.0)
                                                      .sorted(Comparator.comparing(Student::getNrIndexu))
                                                      .collect(Collectors.toList());


      for (int i = 0; i < studenciZagrozeni.size(); i++) {
          System.out.println(studenciZagrozeni.toArray()[i].toString());
      }
      return studenciZagrozeni;

}

}


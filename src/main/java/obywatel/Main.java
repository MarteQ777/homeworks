package obywatel;

public class Main {
    public static void main(String[] args)        {

        RejestrObywateli rejestrObywateli = new RejestrObywateli();

        rejestrObywateli.dodajObywatela("09090912345", "Anna", "Dymna" );
        rejestrObywateli.dodajObywatela("34020212345", "Joanna", "Ozywfa" );
        rejestrObywateli.dodajObywatela("45050512345", "Anna", "Kaczka" );
        rejestrObywateli.dodajObywatela("67062112345",  "Dżon", "Dymny" );
        rejestrObywateli.dodajObywatela("02020212345", "Anna", "Dymna" );

        rejestrObywateli.znajdzObywateliUrodzonychPrzed(2000);
        System.out.println("-----------------------------------");
       rejestrObywateli.znajdzObywatelaPoNazwisku("Dymna");
        System.out.println("-----------------------------------");
        System.out.println(rejestrObywateli.znajdzObywatelaPoPesel("02020212345"));

    }
}

package komputerILaptop;

public class Main {
    public static void main(String[] args) {

        Komputer k1 = new Komputer(3, "Dell", TypProcesora.WIELORDZENIOWY);
        Komputer k2 = new Komputer(4, "Dell", TypProcesora.JEDNORDZENIOWY);
        Komputer k3 = new Komputer(6, "HP", TypProcesora.WIELORDZENIOWY);
        Komputer k4 = new Komputer(3, "Lenovo", TypProcesora.WIELORDZENIOWY);

        Laptop l1 = new Laptop(1, "Lenovo", TypProcesora.WIELORDZENIOWY, 14.5, true);
        Laptop l2 = new Laptop(2, "Asus", TypProcesora.JEDNORDZENIOWY, 13.1, false);
        Laptop l3 = new Laptop(2, "Acer", TypProcesora.WIELORDZENIOWY, 15.4, false);
        Laptop l4 = new Laptop(4, "HP", TypProcesora.WIELORDZENIOWY, 17.3, true);

        Komputer[] komputers = new Komputer[]{k1, k2, k3, k4};
        Komputer[] laptops = new Komputer[]{l1, l2, l3, l4};

        int i = 0;
        while (i < komputers.length) {
            System.out.println(komputers[i].toString());
            i++;


        }
        i = 0;
        while (i < laptops.length) {
            if (laptops[i] instanceof Komputer) {
                System.out.println(laptops[i].toString());
                i++;
            }
        }

    }
}

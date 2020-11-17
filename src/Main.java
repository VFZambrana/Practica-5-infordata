import pojos.*;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //producto
        //Producto producto = new Producto("c001","Teclado retroiluminado");
        //System.out.println(producto);

        //Alquilable
        //Alquilable alquilable = new Alquilable("f005","monitor 19cf",10.5);
        //System.out.println(alquilable);

        //Tecnologico
        //Empresa empresa = new Empresa("HP","ayacucho y hondoras",50);
        //Tecnologico tecnologico = new Tecnologico("c445","ceverus 100","USA", Calendar.getInstance().getTime(),empresa);
        //System.out.println(tecnologico);

        //Montor
        Monitor monitor = new Monitor("d330", "ASUS cf27400", 15.5, "full HD");
        System.out.println(monitor);

        //CPU
        Empresa toshiba = new Empresa("TOSHIBA", "Av. Salamanca N 686 Esq. Antezana", 100);
        Cpu cpu = new Cpu("LGA1151", "AMD FX", "USA", Calendar.getInstance().getTime(), toshiba, 16);

        Monitor lg418 = new Monitor("lg1080p", "LGPLUS", 10, "full hd");
        lg418.reset();
        lg418.estado();

        DiscoDuro hdd = new DiscoDuro("toshiba", "hdd500", 50, 500);
        hdd.reset();
        hdd.estado();

        Cpu intel = new Cpu("LGA1051","intel xeon","china",Calendar.getInstance().getTime(),toshiba,500);
        intel.reset();
        intel.estado();

        Impresora impresora = new Impresora("ex445","canon-pixma455",1100);
        impresora.reset();
        impresora.estado();




    }
}

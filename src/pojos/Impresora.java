package pojos;

import Inteface.InterfaceReset;

public class Impresora extends Producto implements InterfaceReset {

    protected int velocidad;

    public Impresora(String codigo, String modelo, int velocidad){
        super(codigo, modelo);

        this.setVelocidad(velocidad);
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void reset() {
        System.out.println("\nreset impresora");
    }

    @Override
    public void estado() {
        System.out.println("PAGINAS IMPRESAS : " + 152200 + "\n");
    }
}

package pojos;

import Inteface.InterfaceReset;

public class DiscoDuro extends Alquilable implements InterfaceReset {
    private int capacidad;

    public DiscoDuro(String codigo, String modelo,double precioHora, int capacidad){
        super(codigo, modelo, precioHora);

        this.setCapacidad(capacidad);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void reset() {
        System.out.println("\nFormateando Disco duro");
    }

    @Override
    public void estado() {
        System.out.println("Sectores defectuosos : " + 1500 + "\n");
    }
}

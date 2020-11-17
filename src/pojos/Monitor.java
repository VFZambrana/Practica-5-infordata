package pojos;

import Inteface.InterfaceReset;

public class Monitor extends Alquilable implements InterfaceReset {

    private String definicionMax;

    public Monitor(String codigo, String modelo,double precioHora, String definicionMax){
        super(codigo, modelo,precioHora);

        this.setDefinicionMax(definicionMax);
    }

    public String getDefinicionMax() {
        return definicionMax;
    }

    public void setDefinicionMax(String definicionMax) {
        this.definicionMax = definicionMax;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "definicionMax='" + definicionMax + '\'' +
                ", precioHora=" + precioHora +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void estado() {
        System.out.println("vida util : " + 5 +"\n");
    }

    @Override
    public void reset() {
        System.out.println("\nResetenado monitor");
    }
}

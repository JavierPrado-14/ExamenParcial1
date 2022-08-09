/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author javie
 */
public class Aereo extends Vehiculo {
    
    private String Alas, turbina, ventanas, llantas, butacas;

    public Aereo(String Alas, String turbina, String ventanas, String llantas, String butacas, String timon, String sillones, String material, String color, String marca) {
        super(timon, sillones, material, color, marca);
        this.Alas = Alas;
        this.turbina = turbina;
        this.ventanas = ventanas;
        this.llantas = llantas;
        this.butacas = butacas;
    }

    public String getAlas() {
        return Alas;
    }

    public void setAlas(String Alas) {
        this.Alas = Alas;
    }

    public String getTurbina() {
        return turbina;
    }

    public void setTurbina(String turbina) {
        this.turbina = turbina;
    }

    public String getVentanas() {
        return ventanas;
    }

    public void setVentanas(String ventanas) {
        this.ventanas = ventanas;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getButacas() {
        return butacas;
    }

    public void setButacas(String butacas) {
        this.butacas = butacas;
    }
    
    
      
    
}

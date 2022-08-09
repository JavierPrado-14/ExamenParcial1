/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author javie
 */
public class Avion extends Aereo {
    
    private String Radar,maletas,pasajero,escalera;

    public Avion(String Radar, String maletas, String pasajero, String escalera, String Alas, String turbina, String ventanas, String llantas, String butacas, String timon, String sillones, String material, String color, String marca) {
        super(Alas, turbina, ventanas, llantas, butacas, timon, sillones, material, color, marca);
        this.Radar = Radar;
        this.maletas = maletas;
        this.pasajero = pasajero;
        this.escalera = escalera;
    }

    public String getRadar() {
        return Radar;
    }

    public void setRadar(String Radar) {
        this.Radar = Radar;
    }

    public String getMaletas() {
        return maletas;
    }

    public void setMaletas(String maletas) {
        this.maletas = maletas;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public String getEscalera() {
        return escalera;
    }

    public void setEscalera(String escalera) {
        this.escalera = escalera;
    }
    
    
}

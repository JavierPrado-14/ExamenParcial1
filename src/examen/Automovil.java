/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author javie
 */
public class Automovil extends Terrestre {
    
    private String luces, pedales, frenomano, motor,bateria;

    public Automovil(String luces, String pedales, String frenomano, String motor, String bateria, String llantas, String retrovisores, String baul, String palanca, String radio, String timon, String sillones, String material, String color, String marca) {
        super(llantas, retrovisores, baul, palanca, radio, timon, sillones, material, color, marca);
        this.luces = luces;
        this.pedales = pedales;
        this.frenomano = frenomano;
        this.motor = motor;
        this.bateria = bateria;
    }

    public String getLuces() {
        return luces;
    }

    public void setLuces(String luces) {
        this.luces = luces;
    }

    public String getPedales() {
        return pedales;
    }

    public void setPedales(String pedales) {
        this.pedales = pedales;
    }

    public String getFrenomano() {
        return frenomano;
    }

    public void setFrenomano(String frenomano) {
        this.frenomano = frenomano;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }
    
    
}

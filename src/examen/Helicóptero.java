/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author javie
 */
public class Helicóptero extends Aereo {
    
    private String elices,spoller,cola,mando;

    public Helicóptero(String elices, String spoller, String cola, String mando, String Alas, String turbina, String ventanas, String llantas, String butacas, String timon, String sillones, String material, String color, String marca) {
        super(Alas, turbina, ventanas, llantas, butacas, timon, sillones, material, color, marca);
        this.elices = elices;
        this.spoller = spoller;
        this.cola = cola;
        this.mando = mando;
    }

    public String getElices() {
        return elices;
    }

    public void setElices(String elices) {
        this.elices = elices;
    }

    public String getSpoller() {
        return spoller;
    }

    public void setSpoller(String spoller) {
        this.spoller = spoller;
    }

    public String getCola() {
        return cola;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }

    public String getMando() {
        return mando;
    }

    public void setMando(String mando) {
        this.mando = mando;
    }
    
    
    
}

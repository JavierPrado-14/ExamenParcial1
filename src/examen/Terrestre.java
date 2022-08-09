/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author javie
 */
public class Terrestre extends Vehiculo {
    
    private String llantas, retrovisores, baul, palanca, radio;

    public Terrestre(String llantas, String retrovisores, String baul, String palanca, String radio, String timon, String sillones, String material, String color, String marca) {
        super(timon, sillones, material, color, marca);
        this.llantas = llantas;
        this.retrovisores = retrovisores;
        this.baul = baul;
        this.palanca = palanca;
        this.radio = radio;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getRetrovisores() {
        return retrovisores;
    }

    public void setRetrovisores(String retrovisores) {
        this.retrovisores = retrovisores;
    }

    public String getBaul() {
        return baul;
    }

    public void setBaul(String baul) {
        this.baul = baul;
    }

    public String getPalanca() {
        return palanca;
    }

    public void setPalanca(String palanca) {
        this.palanca = palanca;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    
    
       
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author javie
 */
public class Vehiculo {
    private String timon,sillones,material,color,marca;

    public Vehiculo(String timon, String sillones, String material, String color, String marca) {
        this.timon = timon;
        this.sillones = sillones;
        this.material = material;
        this.color = color;
        this.marca = marca;
    }

    public String getTimon() {
        return timon;
    }

    public void setTimon(String timon) {
        this.timon = timon;
    }

    public String getSillones() {
        return sillones;
    }

    public void setSillones(String sillones) {
        this.sillones = sillones;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}

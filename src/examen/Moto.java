/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author javie
 */
public class Moto extends Terrestre {
    
    private String Asiento, Clucht,mangos,escape,parrilla;

    public Moto(String Asiento, String Clucht, String mangos, String escape, String parrilla, String llantas, String retrovisores, String baul, String palanca, String radio, String timon, String sillones, String material, String color, String marca) {
        super(llantas, retrovisores, baul, palanca, radio, timon, sillones, material, color, marca);
        this.Asiento = Asiento;
        this.Clucht = Clucht;
        this.mangos = mangos;
        this.escape = escape;
        this.parrilla = parrilla;
    }

    public String getAsiento() {
        return Asiento;
    }

    public void setAsiento(String Asiento) {
        this.Asiento = Asiento;
    }

    public String getClucht() {
        return Clucht;
    }

    public void setClucht(String Clucht) {
        this.Clucht = Clucht;
    }

    public String getMangos() {
        return mangos;
    }

    public void setMangos(String mangos) {
        this.mangos = mangos;
    }

    public String getEscape() {
        return escape;
    }

    public void setEscape(String escape) {
        this.escape = escape;
    }

    public String getParrilla() {
        return parrilla;
    }

    public void setParrilla(String parrilla) {
        this.parrilla = parrilla;
    }
    
    
}

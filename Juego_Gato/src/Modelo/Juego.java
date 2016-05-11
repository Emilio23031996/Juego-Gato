/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.logging.Logger;

/**
 *
 * @author Richard
 */
//Atributos del Objeto Juego
public class Juego {

    public String componente1;
    public String componente2;
    public String componente3;
    public String componente4;
    public String componente5;
    public String componente6;
    public String componente7;
    public String componente8;
    public String componente9;
    public int turno;
    public String OpcionX;
    public String OpcionO;
    public int Gnador;
    public boolean Error;

    //Constructores de la clase Juego
    public Juego() {
        componente1="";
        componente2="";
        componente3="";
        componente4="";
        componente5="";
        componente6="";
        componente7="";
        componente8="";
        componente9="";
        turno = 0;
        OpcionX = "x";
        OpcionO = "o";
        Gnador = 0;
        Error = true;
    }

    //Metod get y set

    public String getComponente1() {
        return componente1;
    }

    public void setComponente1(String componente1) {
        this.componente1 = componente1;
    }

    public String getComponente2() {
        return componente2;
    }

    public void setComponente2(String componente2) {
        this.componente2 = componente2;
    }

    public String getComponente3() {
        return componente3;
    }

    public void setComponente3(String componente3) {
        this.componente3 = componente3;
    }

    public String getComponente4() {
        return componente4;
    }

    public void setComponente4(String componente4) {
        this.componente4 = componente4;
    }

    public String getComponente5() {
        return componente5;
    }

    public void setComponente5(String componente5) {
        this.componente5 = componente5;
    }

    public String getComponente6() {
        return componente6;
    }

    public void setComponente6(String componente6) {
        this.componente6 = componente6;
    }

    public String getComponente7() {
        return componente7;
    }

    public void setComponente7(String componente7) {
        this.componente7 = componente7;
    }

    public String getComponente8() {
        return componente8;
    }

    public void setComponente8(String componente8) {
        this.componente8 = componente8;
    }

    public String getComponente9() {
        return componente9;
    }

    public void setComponente9(String componente9) {
        this.componente9 = componente9;
    }

 
  

}

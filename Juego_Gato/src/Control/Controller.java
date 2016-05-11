/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Juego;
import Vista.Form_vista1;
import javax.swing.JOptionPane;

/**
 *
 * @author Richard
 */
public class Controller {

    public int contjuego = 0;
 public static int contx=0;
 public static int conto=0;
     /** En este metodo validaremos  las juegadasque se pueden realizar  para obtener el ganador de cada partida **/ 
    public void Jugada(Juego objuego) {

        if (((objuego.componente1.equals(objuego.OpcionX)) && (objuego.componente2.equals(objuego.OpcionX)) && (objuego.componente3.equals(objuego.OpcionX)))
                || ((objuego.componente4.equals(objuego.OpcionX)) && (objuego.componente5.equals(objuego.OpcionX)) && (objuego.componente6.equals(objuego.OpcionX)))
                || ((objuego.componente7.equals(objuego.OpcionX)) && (objuego.componente8.equals(objuego.OpcionX)) && (objuego.componente9.equals(objuego.OpcionX)))
                || ((objuego.componente1.equals(objuego.OpcionX)) && (objuego.componente4.equals(objuego.OpcionX)) && (objuego.componente7.equals(objuego.OpcionX)))
                || ((objuego.componente2.equals(objuego.OpcionX)) && (objuego.componente5.equals(objuego.OpcionX)) && (objuego.componente8.equals(objuego.OpcionX)))
                || ((objuego.componente3.equals(objuego.OpcionX)) && (objuego.componente6.equals(objuego.OpcionX)) && (objuego.componente9.equals(objuego.OpcionX)))
                || ((objuego.componente1.equals(objuego.OpcionX)) && (objuego.componente5.equals(objuego.OpcionX)) && (objuego.componente9.equals(objuego.OpcionX)))
                || ((objuego.componente3.equals(objuego.OpcionX)) && (objuego.componente5.equals(objuego.OpcionX)) && (objuego.componente7.equals(objuego.OpcionX)))) 
        {
               
            contx ++;
                JOptionPane.showMessageDialog(null, "El Ganador es X");
        
               Form_vista1.form.Juego_Nuevo();
    
         
        } 
        else if (((objuego.componente1.equals(objuego.OpcionO)) && (objuego.componente2.equals(objuego.OpcionO)) && (objuego.componente3.equals(objuego.OpcionO)))
                || ((objuego.componente4.equals(objuego.OpcionO)) && (objuego.componente5.equals(objuego.OpcionO)) && (objuego.componente6.equals(objuego.OpcionO)))
                || ((objuego.componente7.equals(objuego.OpcionO)) && (objuego.componente8.equals(objuego.OpcionO)) && (objuego.componente9.equals(objuego.OpcionO)))
                || ((objuego.componente1.equals(objuego.OpcionO)) && (objuego.componente4.equals(objuego.OpcionO)) && (objuego.componente7.equals(objuego.OpcionO)))
                || ((objuego.componente2.equals(objuego.OpcionO)) && (objuego.componente5.equals(objuego.OpcionO)) && (objuego.componente8.equals(objuego.OpcionO)))
                || ((objuego.componente3.equals(objuego.OpcionO)) && (objuego.componente6.equals(objuego.OpcionO)) && (objuego.componente9.equals(objuego.OpcionO)))
                || ((objuego.componente1.equals(objuego.OpcionO)) && (objuego.componente5.equals(objuego.OpcionO)) && (objuego.componente9.equals(objuego.OpcionO)))
                || ((objuego.componente3.equals(objuego.OpcionO)) && (objuego.componente5.equals(objuego.OpcionO)) && (objuego.componente7.equals(objuego.OpcionO)))) {
                  conto++;
            
                  JOptionPane.showMessageDialog(null, "El Ganador es O");
                 Form_vista1.form.Juego_Nuevo();
    
        }    
       
      }
    /**Este metodo limpia los jtextfield para empezar una nueva partida **/ 
    public void Nuevo_Juego(Juego objuego)
    {
    objuego.componente1="";
    objuego.componente2="";
    objuego.componente3="";
    objuego.componente4="";
    objuego.componente5="";
    objuego.componente6="";
    objuego.componente7="";
    objuego.componente8="";
    objuego.componente9="";
    
    }

              
    
}

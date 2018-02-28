/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

public class Propietario {

    int nivelAlcohol;
    boolean genero;

    boolean ebrio() {

        if (nivelAlcohol > 1) {
            
            return true;
        } else {
            return false;
        }
    }

    boolean persona() {
       

        if (genero == true){
            
            System.out.println("MUJER");
            return true;

        } else {
            
            System.out.println("HOMBRE");
            return false;
        }

    }

}

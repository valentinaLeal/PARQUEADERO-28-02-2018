/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

public class Celador {

    String saludar() {

        return "Buenos dias!!";
    }

    String saludar(boolean nivelBorracho, boolean genero) {

        if (nivelBorracho == true && genero==true) {
            return "Largo de aqui";
        } else {
            return "siga";

        }
    }

    boolean saludar(boolean ebrio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


    


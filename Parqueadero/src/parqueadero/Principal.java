/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

/**
 *
 * @author Estudiantes
 */
public class Principal {

   
    public static void main(String[] args) {
       
        Celador miCelador;
        miCelador=new Celador ();
        
        Propietario propietario1, propietario2, propietario3, propietario4;
        propietario1= new Propietario ();
        propietario2= new Propietario ();
        propietario3= new Propietario ();
        propietario4= new Propietario ();
        
        propietario1.nivelAlcohol= 5;
        propietario1.genero= false;
       System.out.println("LARGO DE AQUI!!");
        
        propietario2.nivelAlcohol=6;
        propietario2.genero=true;
        
        
        
        
        
        
        propietario3.nivelAlcohol=0;
        propietario3.genero=false;
        System.out.println("Hola Doctor");
        
        
        
        propietario4.nivelAlcohol=0;
        propietario4.genero=true;
        System.out.println("Mamasita rica, SIGA");
        
        
        
        System.out.println(miCelador.saludar(propietario4.ebrio()));
        
        
            
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author USUARIO
 */
public class Prueba_arreglo {
    public static void main(String[] args) {
//        Arreglos objeto=new Arreglos();
//        System.out.println(objeto.show());
        
        Arreglos entrada=new Arreglos(5);
        System.out.println(entrada.show());
        System.out.println(entrada.show());
        entrada.redimenciona(3);
        entrada.redimenciona(8);
        System.out.println(entrada.show());
               
        
//        Arreglos objeto3 = new Arreglos(new int []{2,3,4});
//        System.out.println(objeto3.show());
    }
}

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
public class PruebaArreglosDinamicos {
    public static void main(String[] args) {
        ArreglosDinamicos obj =new ArreglosDinamicos(); 
        obj.inserta(5);
        obj.inserta(15);
        obj.inserta(25);
        obj.inserta(35);
        obj.inserta(45);
        System.out.println(obj.show());
        int x= obj.elimina(3);
            if (x!= -1) {
                System.out.println("Dato elimindado = "+x);
        }
            System.out.println(obj.show());
    }
}

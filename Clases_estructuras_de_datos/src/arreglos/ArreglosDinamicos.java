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
public class ArreglosDinamicos {
    
    private int arr[] = null;
    
    public int[] getArr() {
        return arr;
    }
    
    public void setArr(int[] arr) {
        this.arr = arr;
    }
    
    public String show() {
        String s = "";
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                s += "Dato [" + i + "]=" + arr[i] + "\n";
            }
        } else {
            s = "Error. No hay datos en el arreglo";
        }
        return s;
    }
    
    public void inserta(int d) {
        
        if (arr == null) {
            arr = new int[1];
            arr[0] = d;
        } else {
            int tmp[] = new int[arr.length + 1];
            System.arraycopy(arr, 0, tmp, 0, arr.length);
            tmp[arr.length] = d;
            arr = tmp;
        }
    }
    
    public int elimina(int p) {
        if (arr == null) {
            System.out.println("Error, no hay datos");
            return 1;
        } else {
            if (p < 0 || p>= arr.length) {
                System.out.println("Posición insertada");
            } else {
                int x = arr[p];
                if(p==0 && arr.length ==1) {
                    arr=null;
                } else {
                    int j=0;
                    int tmp[] = new int [arr.length -1];
                    for (int i = 0; i < arr.length; i++) {
                        if (i!=p) {
                            tmp[j]= arr[i];
                        }
                        j+=1;
                    }
                    arr =tmp;
                }
                return x;
            }
        }
        
    }
}

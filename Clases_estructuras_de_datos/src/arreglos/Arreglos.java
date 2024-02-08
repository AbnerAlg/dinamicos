package arreglos;

/**
 *
 * @author USUARIO
 */

public class Arreglos {
    private int arr[];
    
    public Arreglos(int [] arr){
        
        this.arr=arr;
        
    } 
    public Arreglos(){
        arr = new int [10];
        carga();
    }
    public Arreglos (int n){
        this.arr = new int[n];
        carga();
    }
    public Arreglos (int x, int ...arr){//Arreglos no definimo se usa ...
        this.arr=arr;
        carga();
    }
    
    public void redimenciona(int n){
        if(n>0){
            int temporal[] = new int[n];
            if(temporal.length > arr.length){
                System.arraycopy(arr,0,temporal,0,arr.length);
            } else {
                System.arraycopy(arr,0,temporal,0, temporal.length);
            }
            arr=temporal;
        } 
        
    }
    
    private void carga(){
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (Math.random()*10);
        }
    }
    
    public String show(){
        String s = "";
        for (int i=0; i<arr.length; i++){
            s+= "Dato [" +i+"] = " + arr[i] + "\n";
            
        }
        return s;
        
    }
    public int[] getArr(){
        return arr;   
    }
    
    public void setArr (int[] arr){
        this.arr = arr;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosestructuras;

/**
 *
 * @author Jhonny
 */
public class Utilitarios {
    public static int[] ordenarVector(int [] array){
        int aux;
        boolean cambios = false;
        
        while(true){
            cambios = false;
            for(int i = 1; i<array.length; i++){
                if(array[i] < array[i-1])
                {
                    aux = array[i];
                    array[i] = array[i-1];
                    array[i-1] = aux;
                    cambios = true;
                }
            }
            
            if(cambios==false){
                break;
            }
        }
        
        return array;
    }
    
    public static int[] ordenarVectorMayorAMenor(int [] array){
        int aux;
        boolean cambios = false;
        
        while(true){
            cambios = false;
            for(int i = 1; i<array.length; i++){
                if(array[i] > array[i-1])
                {
                    aux = array[i];
                    array[i] = array[i-1];
                    array[i-1] = aux;
                    cambios = true;
                }
            }
            
            if(cambios==false){
                break;
            }
        }
        
        return array;
    }
    
    public static int[] reversarVector(int [] array){
        int aux[] = array;
        int cantaux = array.length-1;
        
        for(int i = 0; i<array.length; i++){
            array[i] = aux[cantaux-i];
        }
        
        return array;
    }
}

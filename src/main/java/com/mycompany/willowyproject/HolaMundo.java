
package com.mycompany.willowyproject;


public class HolaMundo {
    public static void main(String[] args) {
        int numeroentero = 1;
        int numerogrande = 1000;
        
        if(numeroentero < numerogrande){
           System.out.println("El numero chico es menor al numero grande");
        }
        else{
        System.out.println("No pasa nada hombre ekisde ");
        }
        
        while(numeroentero < numerogrande){
            System.out.println("Correcto");
            numeroentero++;
      }
           for (int i = 0; i < 10; i++) {
            System.out.println(i);
            }
   
           
           Willo wiu = new Willo();
        wiu.willow();
        
        double mumerodoble = 2.8;
        char letra = 'c';
        String frase = "Hola Mundo!";
        System.out.println(numeroentero);
        
        gato();
        System.out.println(entero());
        System.out.println(enter(4));
    }
    
    
    public  static void gato(){
        int variable = 0;
               System.out.println("Miau " + variable);
    }
    public  static int entero(){
      int variable = 0;
            return variable;
    }      
            
      public  static int enter(int valor){
      int variable = valor;
            return variable;      
    }
}



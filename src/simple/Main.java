package simple;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        cuadrilatero c1;
        float la1,la2;
        Scanner entrada=new Scanner(System.in);
        
        
        System.out.println("ingrese un lado");
        la1=entrada.nextFloat();
        
        System.out.println("ingrese el otro lado");
        la2=entrada.nextFloat();
        
        if(la1==la2){
        
        c1=new cuadrilatero(la1);
        }
        else{
        c1=new cuadrilatero(la1,la2);
        }
        
        System.out.println("el area es "+c1.getArea());
        System.out.println("el perimetro es"+c1.getPerimetro());
    }

}

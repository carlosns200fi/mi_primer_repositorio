//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random aleatorio=new Random();
        int sD1=0, sD2=0, sD3=0,dado2, dado1, dado3;

        for (int i=1; i<=20; i++){
            dado1= aleatorio.nextInt((6)+1);
            dado2= aleatorio.nextInt((6)+1);
            dado3= aleatorio.nextInt((6)+1);
            sD1=sD1+dado1;
            sD2=sD2+dado2;
            sD3=sD3+dado3;
        }

        if (sD1>sD2 && sD1>sD3){
            System.out.println("El dado 1 ocupa el primer lugar: "+sD1);
            if (sD2>sD3){
                System.out.println("El dado ocupa el segundo lugar: "+sD2);
                System.out.println("El dado 3 ocupa el tercer lugar: "+sD3);
            }else if (sD3>sD2){
                System.out.println("El dado 3 ocupa segundo lugar: "+sD3);
                System.out.println("El dado 2 ocupa el tercer lugar: "+sD2);
            }
        }
        else if (sD2>sD1 && sD2>sD3) {
            System.out.println("El dado 2 es el gran ganador: "+sD2);
            if (sD1>sD3){
                System.out.println("El dado 1 ocupo el segundo lugar: "+sD1);
                System.out.println("El dado 3 ocupo el ultimo lugar: "+sD3);
            } else if (sD3>sD1) {
                System.out.println("El dado 3 ocupo el segundo lugar: "+sD3);
                System.out.println("El dado 1 ocupo el ultimo lugar: "+sD1);
            }
        }
        else if (sD3>sD1 && sD3>sD2){
            System.out.println("El dado 3 es el gran ganador: "+sD3);
            if (sD1>sD2){
                System.out.println("El dado 1 ocupo el segundo: "+sD1);
                System.out.println("El dado 2 ocupo el ultimo: "+sD2);


            } else if (sD2>sD1) {
                System.out.println("El dado 2 ocupo el segundo: "+sD2);
                System.out.println("El dado 1 ocupo el ultimo:  "+sD1);
            }
        }
    }
}
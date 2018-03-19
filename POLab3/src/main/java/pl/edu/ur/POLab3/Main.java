/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        
        int w;
        Scanner skan = new Scanner(System.in);
        do{
        System.out.print("Menu: 1.[Zad 1.4] 2.[Zad 1.7] 3.[Zad 2.2] 4.[Zad 3.3 Rekurencyjnie] "
                + "5.[Zad 3.3 Iteracyjnie] 6.[Zad 3.4 Rekurencyjnie]"
                + "6.[Zad 3.4 Iteracyjnie] 7.KONIEC PROGRAMU\nWybierz zadanie: ");
        w = skan.nextInt();
        switch(w)
        {
            case 1:
                Zadania.zadanie1_4();
                break;
            case 2:
                Zadania.zadanie1_7();
                break;
            case 3:
                Zadania.zadanie2_2();
                break;
            case 4:
                Zadania.zadanie3_3rek();
                break;
            case 5:
                Zadania.zadanie3_3iter();
                break;
            case 6:
                Zadania.zadanie3_4rek();
                break;
            case 7:
                Zadania.zadanie3_4iter();
                break;
            case 8:
                System.out.println("Program zakonczy prace");
                break;
            default:
                System.err.println("ERROR!Nieprawidlowy numer zadania!");
                break;
        }
        }while(w!=8);
    }
    
}

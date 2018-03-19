/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;


import java.util.Scanner;

/**
 *
 * @author tusia
 */
public class Zadania {
    public static void zadanie1_4()
    {
       System.out.println("-----ZADANIE 1.4-----");
       int a,b,c,d,e,f;
       //Operator "<<" przesuniecia bitow w lewo ze znakiem
       System.out.println("Operator \"<<\" przesuniecia bitow w lewo ze znakiem");
       a = 54;
       b = (a<<2); //Polecenie wykona operacje przesuniecia w lewo o 2 bity z zachowanym znakiem
       System.out.println("Przed presinieciem: "+a+"\nPo przesunieciu: "+b);
       //Operator ">>" przesuniecia bitow w prawo ze znakiem
       System.out.println("Operator \">>\" przesuniecia bitow w prawo ze znakiem");
       c = 65;
       d = (c>>2); //Polecenie wykona operacje przesuniecia w prawo o 2 bity z zachowanym znakiem
       System.out.println("Przed presinieciem: "+c+"\nPo przesunieciu: "+d);
       //Operator ">>>" przesuniecia bitow w prawo bez znaku
       System.out.println("Operator \">>>\" przesuniecia bitow w prawo bez znaku");
       e = 32;
       f = (e>>>3);//Polecenie wykona operacje przesuniecia w prawo o 3 bity bez zachowania znaku
       System.out.println("Przed presinieciem: "+e+"\nPo przesunieciu: "+f);
       System.out.println("-----KONEIC ZADANIA-----");
    }
    public static void zadanie1_7()
    {
       System.out.println("-----ZADANIE 1.7-----");
       int a = 10;
       int b = 5;
       int xor,not,not2;
       xor = a^b; //W jave XOR odpowiada operator ^
       not = ~a;// W javie NOT odpowiada operator ~
       not2 = ~b;
       /*(NOT)Wynik jest równy n-1 poniewaz w systemie binarnym uzupenienia do 2 
       liczby dodatnie zaczynaja sie od 0, a ujemne od -1*/
       System.out.println("a = "+a+" b= "+b);
       System.out.println("a^b= "+xor);
       System.out.println("~a= "+not);
       System.out.println("~b= "+not2);
       System.out.println("-----KONEIC ZADANIA-----");
    }
    public static void zadanie2_2()
    {
        System.out.println("-----ZADANIE 2.2-----");   
                //toCharArray
                String s1 = "Objective Programming";
                String s3 = "OBJECTIVE PROGRAMMING";
                String s5 = "slowo";
                String s6 = "    Objective Programming     ";
                System.out.println(s1.toCharArray());//String s1 zamieniany jest na tablice znaków 
                //getBytes 
                byte[] s2;
                s2 = s1.getBytes();//Wyświetla bajt kazdego znaku 
                for(int i=0;i<s2.length;i++)
                {
                    System.out.print(i+"."+s2[i]+" ");
                }
                System.out.print("\n");
                //boolean equals
                boolean row;
                row = s1.equals(s3); //Sprawdza czy s1 s2 są równe zwracajac uwage na wielkosc znakow i zwraca true lub false
                System.out.println(row);
                row = s1.equalsIgnoreCase(s3);//Sprawdza czy s1 s2 są równe ingorujac wielkosc znakow i zwraca true lub false 
                System.out.println(row);
                //compareTo
                System.out.println(s1.compareTo(s3));//porownuje s1 do s2 i gdy znak sie rozni dodaje 1 
                System.out.println(s1.compareToIgnoreCase(s3));//Porwonuje s1 do s2 ignorujac znaki,gdy znak sie rozni dodaje 1 
                //indexOf
                System.out.println(s1.indexOf('m'));//Podaje numer znaku pierwszego wystapienia zaczynajac od 0 
                System.out.println(s1.indexOf('m',1));//Podaje numer znaku pierwszego wystapienia zaczynajac od 0 od zadanego indexu
                //lastindexOf
                System.out.println(s1.lastIndexOf('a'));//Podaje numer znaku ostatniego wystapienia 
                System.out.println(s1.lastIndexOf('a',3));//Podaje numer znaku ostatniego wystapienia od zadanego indexu
                //subString
                System.out.println(s5.substring(3));//wyswielta czesc string od podanego indexu
                System.out.println(s5.substring(1,3));//wyswielta czesc string od indexu startowego do indexu koncowego
                //replace
                System.out.println(s1.replace('i', 'c'));//zamienia podany znak na inny ktory rowniez podajemy
                //trim
                System.out.println("- trim():\nprzed: "+s6);
                System.out.println("po: "+s6.trim());//usuwa nadmiar spacji przed i za lancuchem znakow
                //toLowerCase
                System.out.println(s1.toLowerCase());
                //toUpperCase
                System.out.println(s1.toUpperCase());
                //split
                String[] s1parts = s1.split("og");//Dzieli String na 2 czesci
                String p1 = s1parts[0];//czesc przed zadanymi znakami
                String p2 = s1parts[1];//czesc po zadanych znakach
                System.out.println(p1);
                System.out.println(p2);
                
                
                
    }
                        //Zadanie 3.3
    public static void zadanie3_3rek()
    {
       
        System.out.println("-----ZADANIE 3.3(Rekurencyjnie)-----");
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.print("Podaj liczbe, ktora chcesz potegowac: ");
        a = s.nextInt();
        System.out.print("Podaj wykladnik:  ");
        b = s.nextInt();
        System.out.println("Liczba " + a + " do potegi " + b + " wynosi: " + potegarek(a, b));
        System.out.println("-----KONEIC ZADANIA-----");
    }
        public static long potegarek(int a, int b)
        { 
            if(b==0) return 1;
            else return a*potegarek(a,--b);
        }
        
     public static void zadanie3_3iter()
     {
        System.out.println("-----ZADANIE 3.3(Iteracyjnie)-----");
        int a,b;
        long w = 1L;
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbe, ktora chcesz potegowac: ");
        a = s.nextInt();
        System.out.print("Podaj wykladnik:  ");
        b = s.nextInt();  
        for(int i = 1;i <=b;i++)
        {
            w *= a;
        }
         System.out.println("Liczba " + a + " do potegi " + b + " wynosi: " + w);  
         System.out.println("-----KONEIC ZADANIA-----");
     }
                
   //Zadanie 3.4            
    public static void zadanie3_4rek()
    {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("-----ZADANIE 3.4(Rekurencyjnie)-----");
        System.out.print("Podaj, ktory wyraz ciagu Finonacciego chcesz wyswietlic: ");
        n = s.nextInt();
        System.out.println(n+" wyraz ciagu Fibonacciego: "+fibrek(n));
        System.out.println("-----KONEIC ZADANIA-----");
    }
        public static int fibrek(int n)
        {
            if ((n==1)||(n==2)) return 1;
            else return fibrek(n-1)+fibrek(n-2);
        }
    public static void zadanie3_4iter()
    {
        Scanner s = new Scanner(System.in);
        int n,a=1,b=1 ,pom;
        System.out.println("-----ZADANIE 3.4(Iteracyjnie)-----");
        System.out.print("Podaj, ktory wyraz ciagu Finonacciego chcesz wyswietlic: ");
        n = s.nextInt();
        for(int i = 1; i<n;i++)
        {
            pom = a;
            a = b;
            b += pom;
        }
        System.out.println(n+" wyraz ciagu Fibonacciego: "+a);
        System.out.println("-----KONEIC ZADANIA-----");
    }
    
}

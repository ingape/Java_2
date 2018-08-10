/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadiena1;

import java.util.Scanner;

/**
 *
 * @author aepx0
 */
public class JavaDiena1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Calculation calc = new Calculation();
        Scanner sk = new Scanner(System.in);
        System.out.println("Ievadi skaitli");
        double skaitlis1 = sk.nextDouble();
        System.out.println("Ievadi skaitli");
        double skaitlis2 = sk.nextDouble();
        
        double rezultats = calc.Summa(skaitlis1, skaitlis2);
        System.out.println("Summa " + rezultats);
        double rezultats2 = calc.Starpiba(skaitlis1, skaitlis2);
        System.out.println("Starpiba " + rezultats2);
        
        
    }
            
             public static void Piemers2(String[] args)
    {
        Calculation calc = new Calculation();
        calc.Izvade("Vii");
        calc.Izvade("fuuu");
        
    }
    
            public static void Piemers(String[] args)
    {
        // TODO code application logic here
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Hello World!");
        
       // String ievade = sc.nextLine();
       // System.out.println(ievade);
        
        Scanner sp = new Scanner(System.in);
        System.out.print("Tavs vards: ");
        String ievads = sp.nextLine();              
        System.out.println("Hello " + ievads);
        Scanner sk = new Scanner(System.in);
        System.out.println("Dzimsanas gads: ");       
        int gads = sk.nextInt();  
        int vecums = 2018 - gads;
        String b = String.valueOf(vecums);
        System.out.println("Vecums ir " + b);        
        
        
       // ievad = String.valueOf(a);// no integer uz string
       // a = Integer.valueOf(ievad);// no string uz integer
       
       // String ievade = sc.nextLine();
        // int a, b;
        //System.out.println("Pasreizejais gads");
        // a = sc.nextln();
        //System.out.println("Dzimsanas gads");
        // b = sc.nextln();
        // ievade  = String.valueOf(a-b);
        //System.out.println("Jums ir " + ievade + " gadi");
       
       
        
        
    }
    
}

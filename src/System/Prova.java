/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package System;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import payment.Item;
import restourant.Dish;
import restourant.Restourant;

/**
 *
 * @author Mars_DB
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
       File fileM = new File("./src/System/DataFolder/Menu.txt");
       DataInterpeter dM = new DataInterpeter(fileM, "Restourant");
       
       File fileL = new File("./src/System/DataFolder/Library.txt");
       DataInterpeter dL = new DataInterpeter(fileL, "Library");
       
       File fileS = new File("./src/System/DataFolder/Shop.txt");
       DataInterpeter dS = new DataInterpeter(fileL, "Shop");

       for(int i= 1; i < 5; i++ ){
        System.out.println("\n\n"+dM.getData().get(i));
    }
       for(int i= 1; i < 5; i++ ){
        System.out.println("\n\n"+dL.getData().get(i));
    }
       for(int i= 1; i < 5; i++ ){
        System.out.println("\n\n"+dS.getData().get(i));
    }
/*
    String s = "jdhry,725";
    String[] t = s.split(",");
    System.out.println(t[1]);
    System.out.println(Double.parseDouble(s.replaceAll("\\D+", "")));

/*    Restourant r = new Restourant(100, file);
    System.out.println(""+r.getClass().getSimpleName());*/
              
    }
}


    


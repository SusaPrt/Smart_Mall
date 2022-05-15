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
       File file = new File("./src/DataFolder/Menu.txt");
       DataInterpeter dI = new DataInterpeter(file, "Restourant");

       System.out.println("\n\n"+dI.getData().get(1));
       System.out.println("\n\n"+dI.getData().get(2));
       System.out.println("\n\n"+dI.getData().get(3));
       System.out.println("\n\n"+dI.getData().get(4));
/*
    String s = "jdhry,725";
    String[] t = s.split(",");
    System.out.println(t[1]);
    System.out.println(Double.parseDouble(s.replaceAll("\\D+", "")));

/*    Restourant r = new Restourant(100, file);
    System.out.println(""+r.getClass().getSimpleName());*/
              
    }
}


    


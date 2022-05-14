/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package work;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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
       File file = new File("C:\\Users\\39371\\Desktop\\SmartMall\\pr1.txt");
       DataInterpeter dI = new DataInterpeter(file);

       System.out.println("\n\n"+dI.getData().get(1));
       System.out.println("\n\n"+dI.getData().get(2));
       System.out.println("\n\n"+dI.getData().get(3));
       System.out.println("\n\n"+dI.getData().get(4));
              
    }
}


    


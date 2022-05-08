/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restourant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
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
        BufferedReader reader = new BufferedReader(new FileReader("pr1.txt"));
        Scanner sc = new Scanner(file);
        String line = null;
        
        String data[] = null;
        LinkedList first = new LinkedList<String>();
        LinkedList second = new LinkedList<String>();
        LinkedList dessert = new LinkedList<String>();
        LinkedList winesandsoft = new LinkedList<String>();
        LinkedList work = new LinkedList<LinkedList>();
        
        work.add(first);
        work.add(second);
        work.add(dessert);
        work.add(winesandsoft);
        
        int i = 4;
        
        
        
 
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
            line = reader.readLine();
            if(line != null)
                work.add(line);
        }
        System.out.println(work.get(0).toString());
         for(String s: data){
            if(s == "FIRSTS" || i == 1){
                i = 0;
                first.add(s);
            }
                
            else if(s == "SECONDS" || i == 1){
                i = 1;
                second.add(s);
            }
            else if(s == "DESSERTS" || i == 2){
                i = 2;
                dessert.add(s);
            }            
            else if(s == "WINESANDSOFT" || i == 3)
                i = 3;
                winesandsoft.add(s);                
        }
        
        
        
        

    }}
        /*
        int i = 0;
        
        try{
            
            while (line != null){
            //    System.out.println(line);              
                line = reader.readLine();
                
                if(line != null)
                    data = line.split(","); //data will have the values as an array
            }
            reader.close();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        for(String s: data){
            LinkedList works = (LinkedList) work.get(i);
            if(s == "SECONDS" && i == 0)
                    i++;          
            else if(s == "DESSERTS" && i == 0)
                    i++;               
            else if(s == "WINESANDSOFT" && i == 0)
                    i++;
                works.add(s);                
        }
        System.out.println(line.toString());
    }*/

    


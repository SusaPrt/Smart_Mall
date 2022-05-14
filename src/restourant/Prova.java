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
        
        int i = 4;
        
        
        
 
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
            line = reader.readLine();
            line = reader.readLine();
            line = reader.readLine();
            if(line != null){

                if(line == "FIRSTS")
                    i = 0;                           
                else if(line == "SECONDS")
                    i = 1;           
                else if(line == "DESSERTS")
                    i = 2;                       
                else if(line == "WINESANDSOFT")
                    i = 3;
                       
                if(i == 0)
                    switch(i){
                        case 0:
                          first.add(line);
                          break;
                        case 1: 
                            second.add(line);
                            break;
                        case 2:
                            dessert.add(line);
                            break;
                        case 3:
                            winesandsoft.add(line);    
                            break;
                        default:
                            break;                      
                    }
            }
        }
        System.out.println(first.toString());
        
        
        

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

    


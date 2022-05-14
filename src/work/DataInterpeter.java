/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;

/**
 *
 * @author Mars_DB
 */
public class DataInterpeter {
    private DataReader dR;
    private LinkedList<LinkedList> data;
    
    public DataInterpeter(File f) throws FileNotFoundException{
        this.dR = new DataReader(f);
        this.data = new LinkedList<>();       
        readData(this.dR.getRawData());
    }
    
    private void readData(LinkedList<String> rawData){
        this.data.add(new LinkedList<String>());
        int i = 0;        
        for(String s: rawData){
            if(s.contains("#")){                
                this.data.add(new LinkedList<String>());
                i++;
            }
            this.data.get(i).add(s);
        } 
    } 
    
    public LinkedList<LinkedList> getData(){
        return this.data;
    }
}

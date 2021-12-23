/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import uam.pvoe.classes.Material;

/**
 * This is the class MaterialRegistration, which is used to write information in
 * the .dat files.
 * @author pedro
 */
public class MaterialRegistration {
    /**
     * This method is used to write information in the STEM .dat file.
     * @param m it's a variable of material type.
     * @return 
     */
    public String STEMRegistration2(Material m){
        String err = null;
        //file creation.
        try{
            File arc = new File("cbi.dat");
            if (arc.createNewFile()){
            }else{
                //System.out.println("The file already exits");
            }
        }
        catch(IOException e){
            err = "An error has occurred";
            e.printStackTrace();
        }
        
        //file writing.
        try{
           FileWriter esc = new FileWriter("cbi.dat", true);
           esc.write(m.getTitle()+ "," + m.getAuthorName()+
                            "," + m.getAuthorLastN()+ "," + m.getKey()
                            + "," + m.getIssueNum()+ "," + m.getType()+ "," 
                        + m.getSubject()+  "\n");
           
           esc.close();
           //System.out.println("The file has been written successfully.");
        }
        catch(IOException e){
            err = "An error has occurred";
            e.printStackTrace();
        }
        
        return err;
    }
    
    
    /**
     * This method is used to write information in the art .dat file.
     * @param m it's a variable of material type.
     * @return 
     */
    public String artRegistration(Material m){
        String err = null;
        //file creation.
        try{
            File arc = new File("art.dat");
            if (arc.createNewFile()){
                //System.out.println("File: " + arc.getName() + " created");
            }else{
                //System.out.println("The file already exits.");
            }
        }
        catch(IOException e){
            err = "An error has occurred";
            e.printStackTrace();
        }
        
        //file writing.
        try{
           FileWriter esc = new FileWriter("art.dat", true);
           esc.write(m.getTitle()+ "," + m.getAuthorName()+
                            "," + m.getAuthorLastN()+ "," + m.getKey()
                            + "," + m.getIssueNum()+ "," + m.getType()+ "," 
                        + m.getSubject()+  "\n");
           
           esc.close();
           //System.out.println("The file has been written successfully.");
        }
        catch(IOException e){
            err = "An error has occurred";
            e.printStackTrace();
        }
        
        return err;
    }
    
    
    /**
     * This method is used to write information in the Social Science .dat file.
     * @param m it's a variable of material type.
     * @return 
     */
    public String ssRegistration(Material m){
        String err = null;
        //file creation.
        try{
            File arc = new File("cs.dat");
            if (arc.createNewFile()){
                //System.out.println("File: " + arc.getName() + " created");
            }else{
                //System.out.println("The file already exits.");
            }
        }
        catch(IOException e){
            err = "An error has occurred";
            e.printStackTrace();
        }
        
        //file writing.
        try{
           FileWriter esc = new FileWriter("cs.dat", true);
           esc.write(m.getTitle()+ "," + m.getAuthorName()+
                            "," + m.getAuthorLastN()+ "," + m.getKey()
                            + "," + m.getIssueNum()+ "," + m.getType()+ "," 
                        + m.getSubject()+  "\n");
           
           esc.close();
           //System.out.println("The file has been written successfully.");
        }
        catch(IOException e){
            err = "An error has occurred";
            e.printStackTrace();
        }
        
        return err;
    }
}

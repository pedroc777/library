/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.operations;

import java.util.LinkedList;

/**
 * This is the CategoryLoading class, which is used to fill linked lists with 
 * information of the materials.
 * @author pedro
 */
public class CategoryLoading {
    
    /**
     * This method is used to fill linked lists with information about the 
     * categories of the materials.
     * @return 
     */
    public LinkedList <String> fillCat(){
        LinkedList <String> list = new LinkedList();
        
        list.add("Select the subject");
        list.add("STEM");
        list.add("Art");
        list.add("Social Sciences");
        
        return list;
    }
    
    /**
     * This method is used to fill linked lists with information about the 
     * types of the materials.
     * @return 
     */
    public LinkedList <String> fillMatType(){
        LinkedList <String> list = new LinkedList();
        
        list.add("Select the type");
        list.add("Magazine");
        list.add("Book");
        list.add("Film");
        
        return list;
    }
}

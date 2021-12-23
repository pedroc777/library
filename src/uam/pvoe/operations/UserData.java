/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.operations;

import uam.pvoe.shared.Shared;

/**
 * This is the class UserData, which is used to validate users who can perform
 * actions in the system.
 * @author pedro
 */
public class UserData {
    
    /**
     * This method is used to validate the user who is introducing information.
     * @param usr this is a variable of string type.
     */
    public void userName(String usr){
        if(usr.compareTo("prro")==0){
            Shared.userName="Prro";
        }
        else if(usr.compareTo("usrA")==0){
            Shared.userName="Usuario A";
        }
        else if(usr.compareTo("usrB")==0){
            Shared.userName="Usuario B";
        }
    }
    
    /**
     * This method is used to ask the user which action is about to take.
     * @param usr this is a variable of string type.
     * @return 
     */
    public String description(String usr){
        if(usr.compareTo("admin")==0){
            return "Select an option.";
        }else{
            return "Press the corresponding button to start a test.";
        }
    }
}

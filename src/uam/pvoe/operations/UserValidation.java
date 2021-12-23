/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.operations;

import java.util.LinkedList;
import uam.pvoe.shared.Shared;
import uam.pvoe.classes.User;

/**
 * This is the class UserValidation, which is used to validate the access who
 * can access to the system.
 * @author pedro
 */
public class UserValidation {

    /**
     * This method is used to compare the user and password with those allowed 
     * in the system.
     * @param usr
     * @return 
     */
    public boolean validateUser(User usr) {
        MaterialLoading mat = new MaterialLoading();
        LinkedList<User> usr2 = new LinkedList();
        usr2 = mat.accessList();

        boolean r = false;

        for (int i = 0; i < usr2.size(); i++) {
            boolean r2;
            if (usr.getLogin().compareTo(usr2.get(i).getLogin()) == 0) {
                if (usr.getPassword().compareTo(usr2.get(i).getPassword()) == 0) {
                    Shared.login = usr2.get(i).getLogin();
                    Shared.userName = usr2.get(i).getLogin();
                    r = true;
                    break;
                } else {
                    r = false;
                }
            } else {
                r = false;
            }
        }

        return r;
    }
}

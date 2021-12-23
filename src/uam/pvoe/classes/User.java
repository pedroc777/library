/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.classes;

/**
 * This is the class User, which is used to create User type objects.
 * @author pedro
 */
public class User {
    /**
     * This attribute is used to assign a user.
     */
    private String login;
    
    /**
     * This attribute is used to assign a password.
     */
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}

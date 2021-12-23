/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.classes;

/**
 * This is the Material class, which helps us to define Material type objects.
 * @author pedro
 */
public class Material {
    
    /**
     * This attribute is used to obtain the title of the material.
     */
    private String title;
    
    /**
     * This attribute is used to obtain the name of the author of the material.
     */
    private String authorName;
    
    /**
     * This attribute is used to obtain the last name of the author of the material.
     */
    private String authorLastN;
    
    /**
     * This attribute is used to obtain the key of the material.
     */
    private String key;
    
    /**
     * This attribute is used to obtain the number of issues of the material.
     */
    private int issueNum;
    
    /**
     * This attribute is used to obtain the type of the material.
     */
    private String type;
    
    /**
     * This attribute is used to obtain the subject of the material.
     */
    private String subject;
    
    /**
     * This attribute is used to obtain the availability the material.
     */
    private String avail;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String autorName) {
        this.authorName = autorName;
    }

    public String getAuthorLastN() {
        return authorLastN;
    }

    public void setAuthorLastN(String autorLastN) {
        this.authorLastN = autorLastN;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAvail() {
        return avail;
    }

    public void setAvail(String avail) {
        this.avail = avail;
    }

       
}

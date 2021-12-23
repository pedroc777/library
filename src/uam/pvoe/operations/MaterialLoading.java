/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.operations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;
import uam.pvoe.classes.Categories;
import uam.pvoe.classes.Material;
import uam.pvoe.classes.User;

/**
 * This is the class MaterialLoading, which is used to read information from 
 * the .dat files.
 * @author pedro
 */
public class MaterialLoading {
    
    /**
     * This method fills a linked list with the information needed to validate
     * users and passwords.
     * @return 
     */
    public LinkedList<User> accessList(){
        LinkedList<User> accessList = new LinkedList();
        String readSt = "";
        FileReader fr;
        try {
            fr = new FileReader("validacion.txt");
            BufferedReader readFile = new BufferedReader(fr);
            readSt = readFile.readLine();
            while (readSt != null) {
                User usr = new User();
                StringTokenizer st = new StringTokenizer(readSt, ",");
                
                usr.setLogin(st.nextToken());
                usr.setPassword(st.nextToken());

                accessList.add(usr);
                readSt = readFile.readLine();
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File not read");
            e.printStackTrace();
        }
        return accessList;
    }
    
    
    /**
     * This method loads the category list
     * @return 
     */
    public LinkedList<Categories> catList(){
        LinkedList<Categories> catList = new LinkedList();
        String readSt = "";
        FileReader fr;
        try {
            fr = new FileReader("categorie.txt");
            BufferedReader readFile = new BufferedReader(fr);
            readSt = readFile.readLine();
            while (readSt != null) {
                Categories cat = new Categories();
                StringTokenizer st = new StringTokenizer(readSt, ",");
                
                cat.setTitleC(st.nextToken());
                cat.setNameC(st.nextToken());
                cat.setLastNameC(st.nextToken());
                cat.setKeyC(st.nextToken());
                cat.setNumberCo(st.nextToken());
                cat.setTypeC(st.nextToken());
                cat.setSubjectC(st.nextToken());

                catList.add(cat);
                readSt = readFile.readLine();
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File not read");
            e.printStackTrace();
        }
        return catList;
    }
    
    
    /**
     * This methods loads the STEM materials
     * @return 
     */
    public LinkedList<Material> STEMList(){
        LinkedList<Material> STEMList = new LinkedList();
        String readSt = "";
        FileReader fr;
        try {
            fr = new FileReader("cbi.dat");
            BufferedReader readFile = new BufferedReader(fr);
            readSt = readFile.readLine();
            while (readSt != null) {
                Material mat = new Material();
                StringTokenizer st = new StringTokenizer(readSt, ",");
                
                mat.setTitle(st.nextToken());
                mat.setAuthorName(st.nextToken());
                mat.setAuthorLastN(st.nextToken());
                mat.setKey(st.nextToken());
                mat.setIssueNum(Integer.parseInt(st.nextToken()));
                mat.setType(st.nextToken());
                mat.setSubject(st.nextToken());

                STEMList.add(mat);
                readSt = readFile.readLine();
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File not read");
            e.printStackTrace();
        }
        return STEMList;
    }
    
    /**
     * This methods loads the Arts materials
     * @return 
     */
    public LinkedList<Material> artList(){
        LinkedList<Material> artList = new LinkedList();
        String readSt = "";
        FileReader fr;
        try {
            fr = new FileReader("art.dat");
            BufferedReader readFile = new BufferedReader(fr);
            readSt = readFile.readLine();
            while (readSt != null) {
                Material art = new Material();
                StringTokenizer st = new StringTokenizer(readSt, ",");
                
                art.setTitle(st.nextToken());
                art.setAuthorName(st.nextToken());
                art.setAuthorLastN(st.nextToken());
                art.setKey(st.nextToken());
                art.setIssueNum(Integer.parseInt(st.nextToken()));
                art.setType(st.nextToken());
                art.setSubject(st.nextToken());

                artList.add(art);
                readSt = readFile.readLine();
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File not read");
            e.printStackTrace();
        }
        return artList;
    }
    
    
    /*This methods loads the Social Sciences materials*/
    public LinkedList<Material> ssList(){
        LinkedList<Material> ssList = new LinkedList();
        String readSt = "";
        FileReader fr;
        try {
            fr = new FileReader("cs.dat");
            BufferedReader readFile = new BufferedReader(fr);
            readSt = readFile.readLine();
            while (readSt != null) {
                Material cs = new Material();
                StringTokenizer st = new StringTokenizer(readSt, ",");
                
                cs.setTitle(st.nextToken());
                cs.setAuthorName(st.nextToken());
                cs.setAuthorLastN(st.nextToken());
                cs.setKey(st.nextToken());
                cs.setIssueNum(Integer.parseInt(st.nextToken()));
                cs.setType(st.nextToken());
                cs.setSubject(st.nextToken());

                ssList.add(cs);
                readSt = readFile.readLine();
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File not read");
            e.printStackTrace();
        }
        return ssList;
    }
    
}

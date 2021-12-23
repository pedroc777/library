/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.operations;

import java.util.LinkedList;
import java.util.Vector;
import uam.pvoe.classes.Categories;
import uam.pvoe.classes.Material;

/**
 * This is the TableLoading class, which is used to fill the table that is shown
 * in the window.
 * @author pedro
 */
public class TableLoading {

    /**
     * This method is used to write the titles of the table
     * @return 
     */
    public Vector<String> columnsTitle() {
        Vector<String> titlesList = new Vector();

        MaterialLoading mat = new MaterialLoading();
        LinkedList<Categories> cat = new LinkedList();

        cat = mat.catList();
        titlesList.add(cat.get(0).getTitleC());
        titlesList.add(cat.get(0).getNameC());
        titlesList.add(cat.get(0).getLastNameC());
        titlesList.add(cat.get(0).getKeyC());
        titlesList.add(cat.get(0).getNumberCo());
        titlesList.add(cat.get(0).getTypeC());
        titlesList.add(cat.get(0).getSubjectC());

        return titlesList;
    }

    
    /**
     * This method is used to fill cells with STEM elements
     * @return 
     */
    public Vector cellsElementsSTEM() {
        Vector countC = new Vector();
        Vector<Object> cell = null;
        MaterialLoading load = new MaterialLoading();

        LinkedList<Material> matList = new LinkedList();

        matList = load.STEMList();
       //Material mat = new Material();

        for (int i = 0; i < matList.size(); i++) {
            cell = new Vector();

            Material mat = matList.get(i);
            cell.add(mat.getTitle());
            cell.add(mat.getAuthorName());
            cell.add(mat.getAuthorLastN());
            cell.add(mat.getKey());
            cell.add(mat.getIssueNum());
            cell.add(mat.getType());
            cell.add(mat.getSubject());
           

            mat = new Material();

            countC.add(cell);
        }
        
        return countC;
    }

    
    /**
     * This method is used to fill cells with Art elements.
     * @return 
     */
    public Vector cellsElementsArt() {
        Vector countC = new Vector();
        Vector<Object> cell = null;
        MaterialLoading load = new MaterialLoading();

        LinkedList<Material> matList = new LinkedList();

        matList = load.artList();
       //Material mat = new Material();

        for (int i = 0; i < matList.size(); i++) {
            cell = new Vector();

            Material mat = matList.get(i);
            cell.add(mat.getTitle());
            cell.add(mat.getAuthorName());
            cell.add(mat.getAuthorLastN());
            cell.add(mat.getKey());
            cell.add(mat.getIssueNum());
            cell.add(mat.getType());
            cell.add(mat.getSubject());
           

            mat = new Material();

            countC.add(cell);
        }
        
        return countC;
    }

    
    /**
     * This method is used to fill cells with Social Science elements.
     * @return 
     */
    public Vector cellsElementsSS() {
        Vector countC = new Vector();
        Vector<Object> cell = null;
        MaterialLoading load = new MaterialLoading();

        LinkedList<Material> matList = new LinkedList();

        matList = load.ssList();
       //Material mat = new Material();

        for (int i = 0; i < matList.size(); i++) {
            cell = new Vector();

            Material mat = matList.get(i);
            cell.add(mat.getTitle());
            cell.add(mat.getAuthorName());
            cell.add(mat.getAuthorLastN());
            cell.add(mat.getKey());
            cell.add(mat.getIssueNum());
            cell.add(mat.getType());
            cell.add(mat.getSubject());
           

            mat = new Material();

            countC.add(cell);
        }
        
        return countC;
    }

    
    /**
     * This method is used to fill cells with main menu elements.
     * @return 
     */
    public Vector cellsElementsP() {
        Vector countC = new Vector();
        Vector<Object> cell = null;
        MaterialLoading load = new MaterialLoading();
        int u,d,t;

        //LinkedList<Material> listaMat = new LinkedList();
        LinkedList<String> kat = new LinkedList();
        LinkedList<Integer> cant = new LinkedList();

        u = load.STEMList().size();
        d = load.artList().size();
        t = load.ssList().size();
        
        cant.add(u);
        cant.add(d);
        cant.add(t);
        
        kat.add("STEM");
        kat.add("Art");
        kat.add("Social Sciences");
        

        for (int i = 0; i < cant.size(); i++) {
            cell = new Vector();

            cell.add(kat.get(i));
            cell.add(cant.get(i));

            //mat = new Material();

            countC.add(cell);
        }
        
        return countC;
    }

    
    /**
     * This method is used to fill cells with the main menu titles.
     * @return 
     */
    public Vector<String> columnsTitleP() {
        Vector<String> subjectList = new Vector();

        subjectList.add("Subject");
        subjectList.add("Record number");

        return subjectList;
    }
}

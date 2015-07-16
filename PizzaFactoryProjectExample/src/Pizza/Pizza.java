/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pizza;

import java.util.ArrayList;

/**
 * An abstract class to represent a pizza
 * @author ryan.chatel
 */
abstract public class Pizza 
{
    //*************************************************************************
    // Member Variables
    //*************************************************************************
    private String name;
    private String dough;
    private String sauce;
    
    ArrayList<String> toppings = new ArrayList<String>(); // a list to hold the toppings
    
    //*************************************************************************
    // Abstract class functions
    //*************************************************************************
    public String getName()
    {
        return name;
    }
    
    public void prepare()
    {
        System.out.println("Preparing " + getName() + " with "+ getDough() + "and " + getSauce());
    }
     public void bake()
    {
        System.out.println("Baking " + getName()+ " with "+ getDough() + "and " + getSauce());
    }
      public void cut()
    {
        System.out.println("Cutting " + getName()+ " with "+ getDough() + "and " + getSauce());
    }
       public void box()
    {
        System.out.println("Boxing " + getName()+ " with "+ getDough() + "and " + getSauce());
    }
       
    @Override
       public String toString()
       {
           StringBuilder s = new StringBuilder();
           s.append("Name: ").append(getName()).append("\n");
           s.append("Dough: ").append(getDough()).append("\n");
           s.append("Sauce: ").append(getSauce()).append("\n");
           
           return s.toString();
       }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dough
     */
    public String getDough() {
        return dough;
    }

    /**
     * @param dough the dough to set
     */
    public void setDough(String dough) {
        this.dough = dough;
    }

    /**
     * @return the sauce
     */
    public String getSauce() {
        return sauce;
    }

    /**
     * @param sauce the sauce to set
     */
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
            
    
}

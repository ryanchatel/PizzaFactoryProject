/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pizza;

import java.util.List;

/**
 *
 * @author ryan.chatel
 */
public class PizzaFactory 
{
    Pizza pizza = null;
    
    public Pizza createPizza(String name, String dough, String sauce)
    {
        
        
        pizza.setName(name);
        pizza.setDough(dough);
        pizza.setSauce(sauce);
        
        return pizza;
    }
    
    public Pizza instantiatePizzaObj(String name)
    {
        if (name.equals("Cheese"))
        {
            pizza = new CheesePizza();
        }
        else if (name.equals("Combination"))
        {
            pizza = new CombinationPizza();
           
        }
        else 
        {
            pizza = new PlainPizza();
        }
        return pizza;
    }
    
    
 
    
   

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pizza;

/**
 *
 * @author ryan.chatel
 */
public class CheesePizza extends Pizza
{
    /**
     * Constructor creates a cheese pizza
     */
    public CheesePizza()
    {
        setName("Cheese ");
        setDough("white ");
        setSauce("Red ");
        toppings.add("Cheese");
        
    }
    
  public String getToppings()
    {
        StringBuilder st = new StringBuilder();
        for (String i: toppings)
        {
            st.append(i);
        }
        return st.toString();
      
    }
  
   @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(getToppings());
        return "Toppings: \n" + sb.toString();
    }
}

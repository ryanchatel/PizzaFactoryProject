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
public final class CombinationPizza extends Pizza
{
    public CombinationPizza()
    {
        setDough("Wheat");
        setName("Combination");
        setSauce("Ranch");
        
        toppings.add("Cheese");
        toppings.add("Black Olives");
        toppings.add("Green Peppers");
        toppings.add("Sausage");
        toppings.add("Pepperoni");
        toppings.add("Onions");
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
        
        
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

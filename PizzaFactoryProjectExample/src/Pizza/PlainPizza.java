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
class PlainPizza extends Pizza {

    
     /**
     * Constructor creates a plain pizza
     */
    public PlainPizza()
    {
        setName("Plain");
        setDough("white ");
        setSauce("Red ");
        toppings.add("None");
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

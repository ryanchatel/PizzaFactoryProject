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
public class PizzaTestDriver 
{
    public static void main(String[] args)
    {
    // initialize factory
    PizzaFactory factory = new PizzaFactory();
    // initialize store
    PizzaStore store = new PizzaStore(factory);
    
    
    Pizza pizzaPie = store.orderPizza("Cheese");
    System.out.println("We ordered" + pizzaPie.toString());
    pizzaPie = store.orderPizza("Charity Pizza"); // should return plain
    System.out.println("We ordered" + pizzaPie.toString());
    pizzaPie = store.orderPizza("Combination"); 
    System.out.println("We ordered" + pizzaPie.toString());
    
    }
}

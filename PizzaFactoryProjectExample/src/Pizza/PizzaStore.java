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
public class PizzaStore 
{
    PizzaFactory factory;
    
    public PizzaStore(PizzaFactory factory)
    {
        this.factory = factory;
    }
    
    public Pizza orderPizza(String typeOfPizza)
    {
        Pizza pie;
        
        pie = factory.instantiatePizzaObj(typeOfPizza);
        
        pie.prepare();
        pie.bake();
        pie.cut();
        pie.box();
        
        return pie;
    }
    
}

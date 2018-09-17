using System;
using System.Collections.Generic;
using System.Text;
using HeadFirst.FactoryPattern.Pizzas;

namespace HeadFirst.FactoryPattern
{
    public class SimplePizzaFactory
    {
        public Pizza CreatePizza(string type)
        {
            Pizza pizza = null;

            //if (type.Equals("cheese"))
            //{
            //    pizza = new CheesePizza();
            //}
            if (type.Equals("pepperoni"))
            {
                pizza = new PepperoniPizza();
            }
            else if (type.Equals("clam"))
            {
                pizza = new ClamPizza();
            }
            else if (type.Equals("veggie"))
            {
                pizza = new VeggiePizza();             
            }

            return pizza;
        }
    }
}

﻿namespace HeadFirst.FactoryPattern.NyPizzas
{
    public class NyStylePizzaStore : PizzaStore
    {
        public NyStylePizzaStore(SimplePizzaFactory factory) : base(factory)
        {
        }

        public override Pizza CreatePizza(string type)
        {
            Pizza pizza = null;
            if (type.Equals("cheese")) 
                pizza = new NYStyleCheesePizza();
            else if (type.Equals("pepperoni"))
                pizza = new NYStylePepperoniPizza();
            else if (type.Equals("clam"))
                pizza = new NYStyleClamPizza();
            else if (type.Equals("veggie"))
                pizza = new NYStyleVeggiePizza();

            return pizza;
        }
    }
}

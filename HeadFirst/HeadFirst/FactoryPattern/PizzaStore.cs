using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.FactoryPattern
{
    public abstract class PizzaStore
    {
        private SimplePizzaFactory factory;

        public PizzaStore(SimplePizzaFactory factory)
        {
            this.factory = factory;
        }

        public Pizza OrderPizza(string type)
        {
            Pizza pizza = CreatePizza(type);
            return pizza;
        }

        public abstract Pizza CreatePizza(string type);
    }
}

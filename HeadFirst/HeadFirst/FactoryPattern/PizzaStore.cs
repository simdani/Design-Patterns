using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.FactoryPattern
{
    public abstract class PizzaStore
    {
        private readonly SimplePizzaFactory _factory;

        public PizzaStore(SimplePizzaFactory factory)
        {
            this._factory = factory;
        }

        protected PizzaStore()
        {
        }

        public Pizza OrderPizza(string type)
        {
            Pizza pizza = CreatePizza(type);
            pizza.Prepare();
            pizza.Bake();
            pizza.Cut();
            pizza.Box();
            return pizza;
        }

        public abstract Pizza CreatePizza(string type);
    }
}

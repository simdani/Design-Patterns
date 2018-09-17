using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.FactoryPattern.PizzaIngredients.NY
{
    public class NyPizzaIngredientFactory :  IPizzaIngredientFactory
    {
        public IDough CreateDough()
        {
            return new ThinCrustDough();
        }

        public Clams CreateClam()
        {
            return new FreshClams();
        }

        public Cheese CreateCheese()
        {
            return new ReggianoCheese();
        }

        public Pepperoni CreatePepperoni()
        {
            return new SlicedPepperoni();
        }

        public Sauce CreateSauce()
        {
            return new MarinaraSauce();
        }

        public Veggies[] CreateVeggies()
        {
            Veggies[] veggies = { new Garlic() };
            return veggies;
        }
    }
}

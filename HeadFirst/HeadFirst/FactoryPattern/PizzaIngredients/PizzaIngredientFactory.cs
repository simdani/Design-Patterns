using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.FactoryPattern.PizzaIngredients
{
    public interface IPizzaIngredientFactory
    {
        IDough CreateDough();
        Clams CreateClam();
        Cheese CreateCheese();
        Pepperoni CreatePepperoni();
        Sauce CreateSauce();
        Veggies[] CreateVeggies();
    }
}

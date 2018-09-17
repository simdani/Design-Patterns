using System;
using HeadFirst.FactoryPattern.PizzaIngredients;

namespace HeadFirst.FactoryPattern.Pizzas
{
    public class CheesePizza : Pizza
    {
        private IPizzaIngredientFactory ingredientFactory;

        public CheesePizza(IPizzaIngredientFactory ingredientFactory)
        {
            this.ingredientFactory = ingredientFactory;
        }

        public override void Prepare()
        {
            Console.WriteLine("Preparing");
            Dough = ingredientFactory.CreateDough();
            Sauce = ingredientFactory.CreateSauce();
            Cheese = ingredientFactory.CreateCheese();
        }
    }
}

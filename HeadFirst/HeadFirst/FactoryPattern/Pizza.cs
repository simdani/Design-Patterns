using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using HeadFirst.FactoryPattern.PizzaIngredients;

namespace HeadFirst.FactoryPattern
{
    public abstract class Pizza
    {
        protected string Name { get; set; }
        protected IDough Dough { get; set; }
        protected Sauce Sauce { get; set; }
        protected Veggies[] Veggies { get; set; }
        protected Cheese Cheese { get; set; }
        protected Clams Clam { get; set; }
        protected ArrayList Toppings = new ArrayList();

        public abstract void Prepare();

        public void Bake()
        {
            Console.WriteLine("Bake for 25 minutes");
        }

        public virtual void Cut()
        {
            Console.WriteLine("Cutting the pizza");
        }

        public void Box()
        {
            Console.WriteLine("Place pizza in a box");
        }
    }
}

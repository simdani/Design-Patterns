using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.FactoryPattern
{
    public abstract class Pizza
    {
        protected string name { get; set; }
        protected string dough { get; set; }
        protected string sauce { get; set; }
        protected ArrayList toppings = new ArrayList();

        public void Prepare()
        {
            Console.WriteLine("Preparing" + name);
            Console.WriteLine("Adding toppings");
            for (int i = 0; i < toppings.Count; i++)
            {
                Console.WriteLine(toppings[i]);
            }
        }

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

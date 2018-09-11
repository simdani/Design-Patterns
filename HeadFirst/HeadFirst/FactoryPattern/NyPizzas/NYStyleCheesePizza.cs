using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.FactoryPattern.NyPizzas
{
    public class NYStyleCheesePizza : Pizza
    {
        public NYStyleCheesePizza()
        {
            name = "NY Style Sauce and Cheese Pizza";
            dough = "Thin Curst Dough";
            sauce = "Marinate Sauce";

            toppings.Add("Grate Reggiano Cheese");
        }
    }
}

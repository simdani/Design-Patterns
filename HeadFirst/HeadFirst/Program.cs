using System;
using HeadFirst.DecoratorPattern;
using HeadFirst.DecoratorPattern.Beverages;
using HeadFirst.DecoratorPattern.Condiments;
using HeadFirst.FactoryPattern;
using HeadFirst.FactoryPattern.ChicagoPizzas;
using HeadFirst.FactoryPattern.NyPizzas;
using HeadFirst.ObserverPattern;
using HeadFirst.StrategyPattern;
using HeadFirst.StrategyPattern.FlyBehaviors;

namespace HeadFirst
{
    class Program
    {
        static void Main(string[] args)
        {
            PizzaStore nyStore = new NyStylePizzaStore();
            PizzaStore chicagoStore = new ChicagoStylePizzaStore();

            Pizza pizza = nyStore.OrderPizza("cheese");
            
            Console.WriteLine("another....");

            pizza = chicagoStore.OrderPizza("cheese");

            Console.ReadKey();
        }
    }
}

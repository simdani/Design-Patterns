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
using HeadFirst.TemplateMethodPattern;

namespace HeadFirst
{
    class Program
    {
        static void Main(string[] args)
        {
            Tea tea = new Tea();
            Coffee coffee = new Coffee();

            tea.PrepareRecipe();

            // coffee
            coffee.PrepareRecipe();
            Console.ReadKey();
        }
    }
}

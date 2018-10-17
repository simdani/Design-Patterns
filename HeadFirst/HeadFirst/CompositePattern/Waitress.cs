using System;
using System.Collections.Generic;
using System.Text;
using HeadFirst.IteratorPattern;

namespace HeadFirst.CompositePattern
{
    public class Waitress
    {
        private MenuComponent allMenus;

        public Waitress(MenuComponent allMenus)
        {
            this.allMenus = allMenus;
        }

        public void PrintMenu()
        {
            allMenus.Print();
        }

        public void PrintVegetarianMenu()
        {
            Iterator iterator = allMenus.CreateIterator();
            Console.WriteLine("\nVegetarian menu\n----");
            while (iterator.HasNext())
            {
                MenuComponent menuComponent = (MenuComponent) iterator.Next();
                try
                {
                    if (menuComponent.Vegetarian)
                    {
                        menuComponent.Print();
                    }
                } catch(InvalidOperationException e) { }
            }
        }
    }
}

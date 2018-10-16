using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.IteratorPattern
{
    public class Waitress
    {
        private Menu pancakeHouseMenu;
        private Menu dinerMenu;

        public Waitress(Menu pancake, Menu diner)
        {
            this.pancakeHouseMenu = pancake;
            this.dinerMenu = diner;
        }

        public void PrintMenu()
        {
            Iterator pancakeIterator = pancakeHouseMenu.CreateIterator();
            Iterator dinerIterator = dinerMenu.CreateIterator();
            Console.WriteLine("menu breakfast");
            PrintMenu(pancakeIterator);
            Console.WriteLine("lunch");
            PrintMenu(dinerIterator);
        }

        public void PrintMenu(Iterator iterator)
        {
            while (iterator.HasNext())
            {
                MenuItem menuItem = (MenuItem) iterator.Next();
                Console.WriteLine(menuItem.Name);
            }
        }
    }
}

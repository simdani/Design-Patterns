using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.IteratorPattern
{
    public class DinerMenu : Menu
    {
        private static int MAX_ITEMS = 6;
        private int numberOfItemss = 0;
        private MenuItem[] menuItems;

        public DinerMenu()
        {
            AddItem("Vegetarian BLT", "(Fakin') Backon", true, 4.34);
            AddItem("Vegetarian BLT2", "(Fakin') Backon", true, 4.34);
            AddItem("Vegetarian BLT3", "(Fakin') Backon", true, 4.34);
            AddItem("Vegetarian BLT4", "(Fakin') Backon", true, 4.34);
        }

        public Iterator CreateIterator()
        {
            return new DinerMenuIterator(menuItems);
        }

        public void AddItem(string name,
            string description, bool vegetarian, double price)
        {
            MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
            if (numberOfItemss >= MAX_ITEMS)
            {
                Console.WriteLine("Sorry, menu is full");
            }
            else
            {
                menuItems[numberOfItemss] = menuItem;
                numberOfItemss = numberOfItemss + 1;
            }
        }
    }
}

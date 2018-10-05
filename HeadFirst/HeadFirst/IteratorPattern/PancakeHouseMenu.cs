using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.IteratorPattern
{
    public class PancakeHouseMenu
    {
        private ArrayList menuItems { get; }

        public PancakeHouseMenu()
        {
            menuItems = new ArrayList();

            AddItem("K&B's Pancake Breakfast",
                "Panckaes with scramble eggs",
                false,
                2.99);

            AddItem("Regular Pancake Breakfast",
                "Panckaes with fired egss",
                false,
                2.99);

            AddItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

            AddItem("Waffles",
                "Waffles, with your choice of blueberries",
                true,
                3.59);
        }

        public void AddItem(string Name, string Description,
            bool Vegetarian, double Price)
        {
            MenuItem menuItem = new MenuItem(Name, Description, Vegetarian, Price);
            menuItems.Add(menuItem);
        }

    }
}

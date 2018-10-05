using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.IteratorPattern
{
    public class MenuItem
    {
        public string Name { get; private set; }
        public string Description { get; private set; }
        public bool Vegetarian { get; private set; }
        public double Price { get; private set; }

        public MenuItem(string Name, string Description,
            bool Vegetarian, double Price)
        {
            this.Name = Name;
            this.Description = Description;
            this.Vegetarian = Vegetarian;
            this.Price = Price;
        }
    }
}

using System;
using System.Collections.Generic;
using System.Text;
using HeadFirst.IteratorPattern;

namespace HeadFirst.CompositePattern
{
    public class MenuItem : MenuComponent
    {
        private string name;
        private string description;
        private bool vegetarian;
        private double price;

        public MenuItem(string name, string description,
            bool vegetarian, double price)
        {
            this.name = name;
            this.description = description;
            this.vegetarian = vegetarian;
            this.price = price;
        }

        public override void Print()
        {
            Console.WriteLine(" " + name);
            if (vegetarian)
            {
                Console.WriteLine("(v)");
            }

            Console.WriteLine(", " + price);
            Console.WriteLine("    -- " + description);
        }

        public override Iterator CreateIterator()
        {
            return new NullIterator();
        }

    }
}

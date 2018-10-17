using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using HeadFirst.IteratorPattern;

namespace HeadFirst.CompositePattern
{
    public class Menu : MenuComponent
    {
        private ArrayList menuComponents = new ArrayList();
        private string name;
        private string description;

        public Menu(string name, string description)
        {
            this.name = name;
            this.description = description;
        }

        public override void Add(MenuComponent menuComponent)
        {
            menuComponents.Add(menuComponent);
        }

        public override void Remove(MenuComponent menuComponent)
        {
            menuComponents.Remove(menuComponent);
        }

        public override MenuComponent GetChild(int i)
        {
            return (MenuComponent) menuComponents[i];
        }

        public override void Print()
        {
            Console.WriteLine("\n" + name);
            Console.WriteLine(", " + description);
            Console.WriteLine("-----------------");

            // iterator code
        }
    }
}

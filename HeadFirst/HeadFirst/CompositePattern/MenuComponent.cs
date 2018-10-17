using System;
using System.Collections.Generic;
using System.Text;
using HeadFirst.IteratorPattern;

namespace HeadFirst.CompositePattern
{
    public abstract class MenuComponent
    {
        public Iterator iterator { get; } = null;
        public string Name { get; }
        public string Descritpion { get; }
        public double Price { get; }
        public bool Vegetarian { get; }

        public virtual void Add(MenuComponent menuComponent)
        {
            throw new InvalidOperationException();
        }

        public virtual void Remove(MenuComponent menuComponent)
        {
            throw new InvalidOperationException();
        }

        public virtual MenuComponent GetChild(int i)
        {
            throw new InvalidOperationException();
        }

        public virtual void Print()
        {
            throw new InvalidOperationException();
        }

        public virtual Iterator CreateIterator()
        {
            if (iterator == null)
            {
            }

            return iterator;
        }
    }
}

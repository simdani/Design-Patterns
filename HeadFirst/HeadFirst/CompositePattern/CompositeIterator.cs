using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using HeadFirst.IteratorPattern;

namespace HeadFirst.CompositePattern
{
    public class CompositeIterator : Iterator
    {
        private Stack stack = new Stack();

        public CompositeIterator(Iterator iterator)
        {
            stack.Push(iterator);
        }
        public bool HasNext()
        {
            if (stack.Count == 0)
            {
                return false;
            }
            else
            {
                Iterator iterator = (Iterator) stack.Peek();
                if (!iterator.HasNext())
                {
                    stack.Pop();
                    return HasNext();
                }
                else
                {
                    return true;
                }
            }
        }

        public object Next()
        {
            if (HasNext())
            {
                Iterator iterator = (Iterator) stack.Peek();
                MenuComponent component = (MenuComponent) iterator.Next();
                if (component is Menu)
                {
                    stack.Push(component.CreateIterator());
                }

                return component;
            }
            else
            {
                return null;
            }
        }
    }
}

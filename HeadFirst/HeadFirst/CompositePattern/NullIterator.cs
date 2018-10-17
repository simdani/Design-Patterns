using System;
using System.Collections.Generic;
using System.Text;
using HeadFirst.IteratorPattern;

namespace HeadFirst.CompositePattern
{
    public class NullIterator : Iterator
    {
        public bool HasNext()
        {
            return false;
        }

        public object Next()
        {
            return null;
        }
    }
}

using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.IteratorPattern
{
    public interface Iterator
    {
        bool HasNext();
        Object Next();
    }
}

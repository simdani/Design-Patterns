using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.IteratorPattern
{
    public interface Menu
    {
        Iterator CreateIterator();
    }
}

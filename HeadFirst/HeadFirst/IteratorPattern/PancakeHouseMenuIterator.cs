using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.IteratorPattern
{
    public class PancakeHouseMenuIterator : Iterator
    {
        private ArrayList menuItems;
        private int position;

        public PancakeHouseMenuIterator(ArrayList menuItems)
        {
            this.menuItems = menuItems;
        }
        public bool HasNext()
        {
            throw new NotImplementedException();
        }

        public object Next()
        {
            throw new NotImplementedException();
        }
    }
}

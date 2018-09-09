using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.DecoratorPattern
{
    public abstract class CondimentDecorator : Beverage
    {
        public abstract override string Description { get; }
    }
}

using System;
using System.Collections.Generic;
using System.Text;
using HeadFirst.DecoratorPattern;
using HeadFirst.DecoratorPattern.Beverages;
using HeadFirst.DecoratorPattern.Condiments;
using Xunit;

namespace HeadFirstTests
{
    public class DecoratorPatternTest
    {
        [Fact]
        public void TestDecoratorPattern()
        {
            Beverage beverage = new Espresso();
            Assert.Equal("Espresso $1.99", beverage.Description + " $" + beverage.Cost());

            Beverage beverage2 = new DarkRoast();
            beverage2 = new Mocha(beverage2);
            beverage2 = new Mocha(beverage2);
            beverage2 = new Whip(beverage2);
            Assert.Equal("Dark Roast Coffee, Mocha, Mocha, Whip $1.49", beverage2.Description + " $" + beverage2.Cost());

            Beverage beverage3 = new HouseBlend();
            beverage3 = new Soy(beverage3);
            beverage3 = new Mocha(beverage3);
            beverage3 = new Whip(beverage3);
            Assert.Equal("House Blend Coffee, Soy, Mocha, Whip $1.34",beverage3.Description + " $" + beverage3.Cost());

        }
    }
}

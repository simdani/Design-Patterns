using System;
using HeadFirst.StrategyPattern;
using HeadFirst.StrategyPattern.FlyBehaviors;
using Xunit;

namespace HeadFirstTests
{
    public class StrategyPatternTests
    {
        [Fact]
        public void MallardDuckTest()
        {
            Duck mallard = new MallardDuck();
            Assert.Equal("I'm flying!", mallard.PerformFly());
            Assert.Equal("Quack!", mallard.PerformQuack());
        }

        [Fact]
        public void ModelDuckTest()
        {
            Duck model = new ModelDuck();
            Assert.Equal("I can't fly!", model.PerformFly());
            model.SetFlyBehavior(new FlyRocketPowered());
            Assert.Equal("Flying with powered rocket!", model.PerformFly());
        }
    }
}

using HeadFirst.StrategyPattern.FlyBehaviors;
using HeadFirst.StrategyPattern.QuacksBehaviors;

namespace HeadFirst.StrategyPattern
{
    public class ModelDuck : Duck
    {
        public ModelDuck()
        {
            flyBehavior = new FlyNoWay();
            quackBehavior = new Squeak();
        }

        public override string Display()
        {
            return "I'm a simple model duck!";
        }
    }
}

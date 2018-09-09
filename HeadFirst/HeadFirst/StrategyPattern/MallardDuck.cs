using HeadFirst.StrategyPattern.FlyBehaviors;
using HeadFirst.StrategyPattern.QuacksBehaviors;

namespace HeadFirst.StrategyPattern
{
    public class MallardDuck : Duck
    {
        public MallardDuck()
        {
            FlyBehavior = new FlyWithWings();
            QuackBehavior = new LoudQuack();
        }

        public override string Display()
        {
            return "I'm a real Mallard duck";
        }
    }
}

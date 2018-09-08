using HeadFirst.StrategyPattern.FlyBehaviors;
using HeadFirst.StrategyPattern.QuacksBehaviors;

namespace HeadFirst.StrategyPattern
{
    public abstract class Duck
    {
        public IFlyBehavior flyBehavior;
        public IQuackBehavior quackBehavior;

        public abstract string Display();

        public string PerformFly()
        {
            return flyBehavior.Fly();
        }

        public string PerformQuack()
        {
            return quackBehavior.Quack();
        }

        public void SetFlyBehavior(IFlyBehavior flyBehavior)
        {
            this.flyBehavior = flyBehavior;
        }

        public string Swim()
        {
            return "All ducks float, even decoys!";
        }
    }
}

using HeadFirst.StrategyPattern.FlyBehaviors;
using HeadFirst.StrategyPattern.QuacksBehaviors;

namespace HeadFirst.StrategyPattern
{
    public abstract class Duck
    {
        public IFlyBehavior FlyBehavior;
        public IQuackBehavior QuackBehavior;

        public abstract string Display();

        public string PerformFly()
        {
            return FlyBehavior.Fly();
        }

        public string PerformQuack()
        {
            return QuackBehavior.Quack();
        }

        public void SetFlyBehavior(IFlyBehavior flyBehavior)
        {
            this.FlyBehavior = flyBehavior;
        }

        public string Swim()
        {
            return "All ducks float, even decoys!";
        }
    }
}

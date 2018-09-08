namespace HeadFirst.StrategyPattern.FlyBehaviors
{
    public class FlyNoWay : IFlyBehavior
    {
        public string Fly()
        {
            return "I can't fly!";
        }
    }
}

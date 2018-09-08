namespace HeadFirst.StrategyPattern.FlyBehaviors
{
    public class FlyRocketPowered : IFlyBehavior
    {
        public string Fly()
        {
            return "Flying with powered rocket!";
        }
    }
}

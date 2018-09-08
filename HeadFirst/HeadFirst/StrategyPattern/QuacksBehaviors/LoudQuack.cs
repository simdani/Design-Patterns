namespace HeadFirst.StrategyPattern.QuacksBehaviors
{
    public class LoudQuack : IQuackBehavior
    {
        public string Quack()
        {
            return "Quack!";
        }
    }
}

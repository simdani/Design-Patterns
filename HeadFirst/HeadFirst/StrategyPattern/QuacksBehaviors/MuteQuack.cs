namespace HeadFirst.StrategyPattern.QuacksBehaviors
{
    public class MuteQuack : IQuackBehavior
    {
        public string Quack()
        {
            return "<< Silence >>";
        }
    }
}

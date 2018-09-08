﻿namespace HeadFirst.StrategyPattern.FlyBehaviors
{
    public class FlyWithWings : IFlyBehavior
    {
        public string Fly()
        {
            return "I'm flying!";
        }
    }
}

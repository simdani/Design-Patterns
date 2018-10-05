using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.TemplateMethodPattern
{
    public abstract class CaffeineBeverage
    {
        public void PrepareRecipe()
        {
            BoiWater();
            Brew();
            PourInCup();
            AddCondiments();
        }

        public abstract void Brew();
        public abstract void AddCondiments();

        public virtual void BoiWater()
        {
            Console.WriteLine("Boiling water");
        }

        public virtual void PourInCup()
        {
            Console.WriteLine("Pouring into cup");
        }

    }
}

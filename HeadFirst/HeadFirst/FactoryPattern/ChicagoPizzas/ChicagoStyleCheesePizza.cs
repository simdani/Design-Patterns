using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.FactoryPattern.ChicagoPizzas
{
    public class ChicagoStyleCheesePizza : Pizza
    {
        public ChicagoStyleCheesePizza()
        {
        }

        public override void Prepare()
        {
            throw new NotImplementedException();
        }

        public override void Cut()
        {
            Console.WriteLine("Cutting the pizza into square slices");
        }
    }
}

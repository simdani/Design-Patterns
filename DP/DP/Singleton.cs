using System;
using System.Collections.Generic;
using System.Text;

namespace DP
{
    public sealed class Singleton
    {
        private static readonly Singleton _instance = new Singleton();

        private Singleton()
        {

        }

        public static Singleton GetInstance()
        {
            return _instance;
        }
    }
}

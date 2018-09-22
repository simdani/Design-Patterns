using System;
using System.Collections.Generic;
using System.Text;

namespace DP.Singleton
{
    public class SingletonInner
    {
        private static class SingletonHolder
        {
            public static SingletonInner instance = new SingletonInner();
        }

        private SingletonInner()
        {

        }

        public static SingletonInner GetInstance()
        {
            return SingletonHolder.instance;
        }
    }
}

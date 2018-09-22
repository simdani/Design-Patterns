// Singleton with lock.

using System;
using System.Collections.Generic;
using System.Text;

namespace DP.Singleton
{
    public class SingletonLocked
    {
        private static SingletonLocked instance = null;
        private static object threadLock = new Object();

        private SingletonLocked()
        {

        }

        public static SingletonLocked GetInstance()
        {
            lock (threadLock)
            {
                if (instance == null)
                {
                    instance = new SingletonLocked();
                }
            }

            return instance;
        }
    }
}

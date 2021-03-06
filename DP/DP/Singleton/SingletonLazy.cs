﻿using System;

namespace DP.Singleton
{
    // thread safe Singleton with lazy loading
    public sealed class SingletonLazy
    {
        private static readonly Lazy<SingletonLazy> _lazy = new Lazy<SingletonLazy>(() => new SingletonLazy());

        private SingletonLazy()
        {
        }

        public static SingletonLazy Instance => _lazy.Value;
    }
}

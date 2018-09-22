using System;
using System.Collections.Generic;
using System.Text;

namespace DP.Factory
{
    public interface IFactory
    {
        Enemy CreateEnemy(string enemyType);
    }
}

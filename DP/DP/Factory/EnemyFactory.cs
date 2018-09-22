using System;
using System.Collections.Generic;
using System.Text;

namespace DP.Factory
{
    public class EnemyFactory : IFactory
    {
        public Enemy CreateEnemy(string enemyType)
        {
            if (enemyType == "P")
            {
                return new Plane();
            }
            else if (enemyType == "S")
            {
                return new Ship();
            }

            return null;
        }
    }
}

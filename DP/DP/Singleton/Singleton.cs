namespace DP.Singleton
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

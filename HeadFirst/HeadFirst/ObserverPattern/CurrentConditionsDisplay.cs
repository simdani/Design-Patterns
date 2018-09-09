using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.ObserverPattern
{
    public class CurrentConditionsDisplay : IObserver, IDisplayElement
    {
        private float _temperature;
        private float _humidity;
        private ISubject _weatherData;

        public CurrentConditionsDisplay(ISubject weatherData)
        {
            this._weatherData = weatherData;
            weatherData.RegisterObserver(this);
        }

        public void Update(float temp, float humidity, float pressure)
        {
            _temperature = temp;
            this._humidity = humidity;
            Display();
        }

        public string Display()
        {
            return "Temperature is " + _temperature + " and " + _humidity;
        }
    }
}

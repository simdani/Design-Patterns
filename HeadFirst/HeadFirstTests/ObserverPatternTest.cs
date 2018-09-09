using System;
using System.Collections.Generic;
using System.Text;
using HeadFirst.ObserverPattern;
using Xunit;

namespace HeadFirstTests
{
    public class ObserverPatternTest
    {
        [Fact]
        public void TestObserver()
        {
            WeatherData weatherData = new WeatherData();

            CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
            //HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

            weatherData.SetMeasurements(50, 65, 30.4f);
            Assert.Equal("Temperature is " + 50 + " and " + 65, currentDisplay.Display());

            weatherData.SetMeasurements(92, 70, 29.2f);
            Assert.Equal("Temperature is " + 92 + " and " + 70, currentDisplay.Display());

            weatherData.SetMeasurements(78, 90, 29.1f);
            Assert.Equal("Temperature is " + 78 + " and " + 90, currentDisplay.Display());
        }
    }
}

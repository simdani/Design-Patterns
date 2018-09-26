using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.FacadePattern
{
    public class HomeTheaterFacade
    {
        public Amplifier amp;
        public Tuner tuner;
        public DvdPlayer dvd;
        public CdPlayer cd;
        public Projector projector;
        public TheaterLights lights;
        public Screen screen;
        public PopcornPopper popper;

        public HomeTheaterFacade(
            Amplifier amp,
            DvdPlayer dvd,
            CdPlayer cd,
            Tuner tuner,
            Projector projector,
            Screen screen,
            TheaterLights lights,
            PopcornPopper popper)
        {
            this.amp = amp;
            this.tuner = tuner;
            this.dvd = dvd;
            this.cd = cd;
            this.projector = projector;
            this.screen = screen;
            this.lights = lights;
            this.popper = popper;
        }

        public void WatchMovie(string movie)
        {
            Console.WriteLine("Get ready to watch a movie");
            popper.On();
            popper.Pop();
            lights.Dim(10);
            screen.Down();
            projector.On();
            projector.WideScreenMode();
            amp.On();
            amp.SetDvd(dvd);
            amp.SetSurroundSound();
            amp.SetVolume(5);
            dvd.On();
            dvd.Play(movie);
        }

        public void EndMovie()
        {
            Console.WriteLine("Shutting movie theater down");
            popper.Off();
            lights.On();
            screen.Up();
            projector.Off();
            amp.Off();
            dvd.Stop();
            dvd.Eject();
            dvd.Off();
        }
    }
}

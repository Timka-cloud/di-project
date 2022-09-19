package kz.timka.di;

public interface IComputer {

    String getName();

    IMonitor getMonitor();

    IMouse getMouse();

    void on();

    void off();
}

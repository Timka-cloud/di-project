package kz.timka.di;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class ComputerNew implements IComputer {

    private String name;


    protected IMonitor monitor;


    protected IMouse mouse;


    @Inject
    public ComputerNew(IMouse mouse, @Named("monitorNew") IMonitor monitor) {
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public ComputerNew() {
    }

    public ComputerNew(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IMonitor getMonitor() {
        return monitor;
    }

    @Override
    public IMouse getMouse() {
        return mouse;
    }

    public void setMouse(IMouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonitor(IMonitor monitor) {
        this.monitor = monitor;
    }


}



package kz.timka.di;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped // что данный обьект будет создан и добавлен в контейнер. и также
// бин будет доступен на протяжении всего приложении
public class Computer implements IComputer{
    private String name;


    protected IMonitor monitor;


    protected IMouse mouse;

    @Inject
    public Computer(IMouse mouse, @Named("monitor") IMonitor monitor) {
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Computer() {
    }

    public Computer(String name) {
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

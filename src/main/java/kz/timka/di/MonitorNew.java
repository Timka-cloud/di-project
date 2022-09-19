package kz.timka.di;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named()
@ApplicationScoped
public class MonitorNew implements IMonitor{
    private String name = "mon2";


    public MonitorNew() {
    }

    public MonitorNew(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

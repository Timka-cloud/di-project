package kz.timka.di;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Named;

@Named()
@ApplicationScoped
public class Monitor implements IMonitor{

    private String name = "mon1";


    public Monitor() {
    }

    public Monitor(String name) {
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

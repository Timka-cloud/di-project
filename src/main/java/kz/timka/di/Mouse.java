package kz.timka.di;

import jakarta.enterprise.context.ApplicationScoped;


public class Mouse implements IMouse{
    @Override
    public void move() {
        System.out.println("move");
    }
}

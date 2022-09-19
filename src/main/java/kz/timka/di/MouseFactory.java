package kz.timka.di;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class MouseFactory {
// по умолчанию синглтон обьекты. и в контейнере по одному экземпляру хранится. но с помощью @Produces делаем чтоб каждый раз
// новый обьект создавался

    @Produces
    public IMouse create() {

        return new Mouse();
    }
}

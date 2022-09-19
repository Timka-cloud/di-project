package kz.timka.di;

import jakarta.enterprise.inject.spi.BeanContainer;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {
    public static void main(String[] args) {
        // т.к JavaSe а не веб приложение, приходится создавать вручную контейнер
        Weld weld = new Weld();
// по умолчанию бины синглтоны. в контейнер один обьект monitor и monitorNew и так далее. кроме Mouse так как мы его сделали
        // не синглтон
        // стартуем контейнер
        WeldContainer container = weld.initialize(); // будет пытаться найти файл beans.xml и считать оттуда информацию кого добавлять в контейнер

        // получаем обьекты из контейнера
//        IMonitor monitor = container.select(IMonitor.class).get();
        IComputer computer1 = container.select(Computer.class).get();
        IComputer computer2 = container.select(ComputerNew.class).get();

       // System.out.println(monitor);
        System.out.println(computer1.getMonitor().getName());
        System.out.println(computer1.getMouse());

        System.out.println(computer2.getMonitor().getName());
        System.out.println(computer2.getMouse());


        // В приложениях могут одновременно использоваться и new и DI – они друг друга не исключают полностью.
        //
        //Только нужно понимать, что через new – объект не попадет в DI контейнер (если только не использовать @Produces


        container.shutdown();
    }
}

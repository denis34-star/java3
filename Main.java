package lesson5;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static final int CARS_COUNT = 4;
    public static final CyclicBarrier cycliBarrier = new CyclicBarrier(CARS_COUNT + 1);
    public static final AtomicInteger finishCars = new AtomicInteger(0);

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random()*10), cycliBarrier, finishCars);
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        cycliBarrier.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИE >>> Гонка началась!!!");

        cycliBarrier.await();
        cycliBarrier.await();

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИE >>> Гонка закончилась!!!");

    }
}

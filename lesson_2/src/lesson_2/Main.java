package lesson_2;

public class Main {
    public static void main(String[] args){
        Clock clock = new Clock(15,42,35);
        System.out.println(clock.isMorning());
        System.out.println(clock);
        clock.resetTime();
        clock.setTime(45,26,99);
        System.out.println(clock);
        clock.setTime(23,59,59);
        System.out.println(clock);
        clock.tick();
        System.out.println(clock);
    }

}

package lesson_2;

public class Clock {

    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int hours, int minutes, int seconds) {
        if (hours < 24 & minutes < 60 & seconds < 60) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }


    }

    public void setTime(int hours, int minutes, int seconds) {
        if (hours < 24 & minutes < 60 & seconds < 60) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
        System.out.println("Time limit. Parameters must be hours<24, minutes<60, seconds<60.");
    }

    public void resetTime() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public boolean isMorning() {
        return hours < 12;
    }

    public void tick() {
        seconds++;
        if (seconds>=60){
            seconds=0;
            minutes++;
            if (minutes>=60){
                minutes=0;
                hours++;
                if (hours>=24){
                    hours=0;
                }
            }
        }

    }

    public String toString(){
        return "Hours: "+hours+";\n"+ "minutes: " + minutes + ";\n" + "seconds: " +seconds +";";
    }
}

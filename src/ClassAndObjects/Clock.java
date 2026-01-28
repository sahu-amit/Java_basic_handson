package ClassAndObjects;

public class Clock {
    int hours;
    int minutes;

    void time(){
        System.out.printf("Time is: %02d:%02d ",hours,minutes);
    }
}
class Clk{
    static void main(String[] args) {
        Clock clock = new Clock();
        clock.hours = 19;
        clock.minutes= 1;

        clock.time();
    }
}

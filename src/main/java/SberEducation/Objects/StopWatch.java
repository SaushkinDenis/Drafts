package SberEducation.Objects;


public class StopWatch {
    private long startTime = 0;
    private long stopTime = 0;

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void stop(){
        stopTime = System.currentTimeMillis();
    }

    public void getElapsedTime(){
        System.out.println(stopTime - startTime);
    }
}

package ss4_OOP.bai_tap;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }
    public long getStopTime() {
        return stopTime;
    }

    public long getElapsedTime() {
        return stopTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.startTime = System.currentTimeMillis();
        sw.stopTime = System.currentTimeMillis();
        System.out.println(sw.getElapsedTime());
    }
}

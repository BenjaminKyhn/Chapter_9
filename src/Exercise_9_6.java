import java.util.Arrays;

public class Exercise_9_6 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] randomNumbers = new int[100000];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)(Math.random()*100);
        }

        stopWatch.start();
        Arrays.sort(randomNumbers);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}

class StopWatch{
    private long startTime;
    private long endTime;

    StopWatch(){
        startTime = System.currentTimeMillis();
    }

    void start(){
        startTime = System.currentTimeMillis();
    }

    void stop(){
        endTime = System.currentTimeMillis();
    }

    long getElapsedTime(){
        return endTime - startTime;
    }

    long getStartTime(){
        return startTime;
    }

    long getEndTime(){
        return endTime;
    }
}
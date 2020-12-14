public class Main {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        long start = watch.start();
        doJob(100000);
        long end = watch.stop();
        long time = watch.getElapsedTime(start,end);
        System.out.println("Timing is: " + time);
    }
    public static void doJob(int count){
        for (int i = 0; i < count; i++) {
            System.out.println(i);
        }
    }
}

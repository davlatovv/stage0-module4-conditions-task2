package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if(first < second){
            System.out.println(second);
        }
        if(second < first){
            System.out.println(first);
        }
    }
}

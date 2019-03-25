package day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class CountTask extends RecursiveTask<Integer> {
    private int start;
    private int end;
    private List<Integer> integerList;
    private static final int THRESHOLD = 10000;

    public CountTask(int start, int end, List<Integer> integerList) {
        this.start = start;
        this.end = end;
        this.integerList = integerList;
    }

    @Override
    protected Integer compute() {
        int sum = 0;

        boolean t = (end - start + 1) <= THRESHOLD;
        if (t) {
            for (int i = start; i <= end; i++) {
                sum += integerList.get(i);
            }
        } else {
            int center = (start + end) / 2;
            CountTask leftTask = new CountTask(start, center, integerList);
            CountTask rightTask = new CountTask(center + 1, end, integerList);

            leftTask.fork();
            rightTask.fork();

            int leftResult = leftTask.join();
            int rightResult = rightTask.join();
            System.out.println("左" + leftResult);
            System.out.println("右" + rightResult);
            sum = leftResult + rightResult;
            System.out.println("合并" + sum);

        }
        return sum;
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Random random = new Random();
        int temSum = 25000000;
//        System.Systemmout.println(random.nextInt(100));
        List list = new ArrayList();
        long now = System.currentTimeMillis();

        while (temSum > 0) {
            list.add(random.nextInt(100));
            temSum--;
        }
        System.out.println("生成随机数所用时间:" + (System.currentTimeMillis() - now));
        CountTask task = new CountTask(0, list.size() - 1, list);

        Future<Integer> future = forkJoinPool.submit(task);

        try {
            System.out.println(future.get());
            System.out.println("总用时:" + (System.currentTimeMillis() - now));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

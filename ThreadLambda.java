public class ThreadLambda {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("bye. " + (i%3+1));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        };
        new Thread(task).start();

        for (int i = 0; i < 100; i++) {
            System.out.println("안녕. " + (i));
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
        }
    }
}

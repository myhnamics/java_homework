public class TheadEx2 {
    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<5;i++){
                    System.out.println("bye. "+i);
                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException e){
                    }
                }
            }
        }).start();

        for (int i = 0; i<5;i++) {
            System.out.println("안녕. "+i);
            try{
                Thread.sleep(1500);
            }catch (InterruptedException e) {
            }
        }
    }
}


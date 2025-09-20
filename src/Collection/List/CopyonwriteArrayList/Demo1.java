package Collection.List.CopyonwriteArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo1 {
    public static void main(String[] args) {
        List<String> item = new CopyOnWriteArrayList<>();
        item.add("Pen");
        item.add("Book");
        item.add("Tea");
        item.add("Cofee");

        Thread readingThread = new Thread(() -> {
            try {
                for (String i : item) {
                        System.out.println("Reading " + i);
                        Thread.sleep(100);
                    }
            } catch (Exception e) {
                System.out.println(e);
            }
        });



        Thread writingThread = new Thread(() -> {
            try {
                Thread.sleep(50);
                item.add("Maggi");
                System.out.println("Added Maggi");

                Thread.sleep(100);
                item.remove("Tea");
                System.out.println("Removed Tea");

                Thread.sleep(100);

            } catch (Exception e) {
                System.out.println(e);
            }
        });

        readingThread.start();
        writingThread.start();

        try {
            // Make sure writingThread has finished before printing the updated list
            writingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the list after the modifications are complete
        System.out.println("Updated list : " + item);
    }
}

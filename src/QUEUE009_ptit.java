import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QUEUE009_ptit {
    public static void reverseQueue(Queue<String> queue, int k) {
        Queue<String> tempQueue = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            tempQueue.add(queue.poll());
        }
        while (!tempQueue.isEmpty()) {
            queue.add(tempQueue.poll());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t-- > 0) {
            String input = scanner.nextLine();
            int k = scanner.nextInt();
            scanner.nextLine();

            String[] elements = input.split(" ");
            Queue<String> queue = new ArrayDeque<>();
            for (String element : elements) {
                queue.add(element);
            }

            reverseQueue(queue, k);

            StringBuilder result = new StringBuilder();
            while (!queue.isEmpty()) {
                result.append(queue.poll());
                if (!queue.isEmpty()) {
                    result.append(" ");
                }
            }
            System.out.println(result);
        }
        scanner.close();
    }
}

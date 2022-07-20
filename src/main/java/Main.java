public class Main {
    public static void main(String[] args) {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        try {
            int i = 25 / 0;
        } catch (Exception e) {
            
            for (StackTraceElement element : stack) {
                System.out.println(element);
            }
        }
    }
}

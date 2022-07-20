public class Main {
    public static void main(String[] args) {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        try {
            int i = 25 / 0;
        } catch (Exception e) {
            if (checkCollection(stack)){
                for (StackTraceElement element : stack) {
                    System.out.println(element);
                }
            }
        }
    }
    public static boolean checkCollection(StackTraceElement[] stack){
        return stack != null;
    }
}

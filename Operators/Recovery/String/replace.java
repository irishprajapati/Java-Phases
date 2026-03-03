public class replace{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello madam");
        sb.replace(6,11, "Sir");
        System.out.println(sb);
    }
}
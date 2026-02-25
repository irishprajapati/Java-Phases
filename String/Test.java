public class Test{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Erish");
        System.out.println(sb.capacity());
        sb.append(" prajapati");
        System.out.println(sb);
        String str = sb.toString();
        sb.insert(6, " data");
        System.out.println(sb);
    }
}
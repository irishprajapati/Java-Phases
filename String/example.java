public class example{
    public static void main(String[] args) {
        String [] items = {"laptop", "mouse", "airpods"};
        StringBuilder email = new StringBuilder();
        for(String item: items){
            email.append("- ")
            .append(item)
            .append("\n");

        }
        System.out.println(email);
    }
}
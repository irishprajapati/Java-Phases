public class Remove{
    public static void main(String[] args) {
        //removing data from specific position
        // StringBuilder sb = new StringBuilder("erish, Anish, Prithivi,");
        // sb.deleteCharAt(sb.length()-1);
        // System.out.println(sb);
        //insert data at specific position
        StringBuilder sb = new StringBuilder("Hello sir");
        sb.insert(6, "Erish ");
        System.out.println(sb);
        
    }
}
package DuckingException;
import java.io.FileReader;
import java.io.IOException;
class ConfigLoader{
    public void loadConfig(String filename) throws IOException{
        FileReader reader = new FileReader(filename);
        System.out.println("Configuration file loaded successfully");
        reader.close();
    }
}
public class FileChecker {
    static void main(String[] args) {
        ConfigLoader c1 = new ConfigLoader();
        try{
            c1.loadConfig("data.txt");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Config load attempt finished");
        }
    }
}

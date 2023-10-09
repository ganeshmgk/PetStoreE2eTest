import org.testng.annotations.Test;
import utils.ConfigReader;

public class Test1 {
    @Test()
    public void m1(){
        System.out.println("hello");
        ConfigReader cr = new ConfigReader();
        System.out.println( cr.getApiKey());
        System.out.println(cr.getBaseURI());
    }
}

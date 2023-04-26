import mobile.Iphone;
import mobile.Nokia;

public class PhoneTest {
    public static void main(String[] args) {
        Nokia nokia = new Nokia();
        Iphone iphone = new Iphone();

        nokia.dowloadApp();
        iphone.dowloadApp();
    }
}
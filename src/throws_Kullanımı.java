import java.io.IOException;

public class throws_Kullanımı {

    public static void yasKontrol(int yas) throws IOException {
        if(yas < 18) {
            throw new IOException("Yasınız 18'den kuçuk.");
        }else {
            System.out.println("Yasal yaştasınız.");
        }
    }


    public static void main(String[] args) throws IOException {
        yasKontrol(10);
        System.out.println("Deneme");
    }
}

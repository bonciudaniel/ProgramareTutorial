package ObiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TelefonTest {




    @Test
    public void MetodaTest(){

        //Facem primul obiect de tipul Telefon
        List<String>CaracteristiciSamsung = Arrays.asList("Ecran:2pixeli", "Ram:4Gb", "Procesor:Exynos");
        Telefon Samsung = new Telefon("Samsung", "GalaxyS7", 2021,"Android",CaracteristiciSamsung);
        Samsung.VechimeTelefon();
        Samsung.DiscountTelefon(20.5);


        List<String>CaracteristiciIphone = Arrays.asList("Ecran:2pixeli", "Ram:8Gb", "Procesor:IOS", "spatiu stocare: 128 gb");
        Telefon Iphone = new Telefon("Iphone", "Iphone7", 2016,"IOS",CaracteristiciIphone);
        Iphone.VechimeTelefon();
        Iphone.PretTelefon();

        List<String>CaracteristiciHuawei = Arrays.asList("Ecran:2pixeli", "Ram:8Gb", "Procesor:A16", "spatiu stocare: 128 gb");
        Telefon Huawei = new Telefon("Huawei", "P20", 2010,"Android",CaracteristiciHuawei,2055.5);
        Huawei.VechimeTelefon();
        Huawei.PretTelefon();
        Huawei.DiscountTelefon(10.0);

    }

}

package ro.esolutions.ThePopeIsComingApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ConectorExtern
{
    @GetMapping("/churches/{month}")
    public String getAllChurches(@PathVariable String month)
    {
        String answer="Bisericile mele sunt: ";

        Biserica CatedralaMN=new Biserica();
        CatedralaMN.nume="Catedrala Mantuirii Neamului";
        CatedralaMN.tipReligie="Ortodox";
        CatedralaMN.luna="January";

        Biserica SfIosif=new Biserica();
        SfIosif.nume="Catedrala Sf Iosif";
        SfIosif.tipReligie="Catolica";
        SfIosif.luna="February";

        Biserica Kretzulescu=new Biserica();
        Kretzulescu.nume="Biserica Kretzulescu";
        Kretzulescu.tipReligie="Ortodox";
        Kretzulescu.luna="December";

        Biserica Amzei=new Biserica();
        Amzei.nume="Biserica Amzei";
        Amzei.tipReligie="Ortodox";
        Amzei.luna="March";

        Biserica Italiana=new Biserica();
        Italiana.nume="Biseica Italiana";
        Italiana.tipReligie="Catolica";
        Italiana.luna="June";

        List<Biserica> biserici=new ArrayList<>();
        biserici.add(CatedralaMN);
        biserici.add(Kretzulescu);
        biserici.add(Italiana);
        biserici.add(Amzei);
        biserici.add(SfIosif);
        for(int i=0;i<biserici.size();i++)
        {
            if (biserici.get(i).luna.equals(month))
            {
                answer+=biserici.get(i).nume + ",";
            }
        }

        return answer;
    }
}

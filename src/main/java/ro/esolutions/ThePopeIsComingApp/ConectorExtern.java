package ro.esolutions.ThePopeIsComingApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConectorExtern
{
    @GetMapping("/churches")
    public String getAllChurches()
    {
        Biserica CatedralaMN=new Biserica();
        CatedralaMN.nume="Catedrala Mantuirii Neamului";
        CatedralaMN.tipReligie="Ortodox";
        return "Bisericile mele sunt: " +CatedralaMN.nume;
    }
}

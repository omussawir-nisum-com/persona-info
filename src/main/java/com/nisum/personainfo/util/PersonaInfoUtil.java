package com.nisum.personainfo.util;

import com.nisum.personainfo.constant.HairColour;
import org.springframework.stereotype.Component;

@Component
public class PersonaInfoUtil {

    public Boolean checkHairColour(String hairColour) {

        Boolean check = false;

        for (HairColour s : HairColour.values()) {
            if(s.getValue().equalsIgnoreCase(hairColour) == true) {
                check = true;
            }
        }

        return check;
    }

}

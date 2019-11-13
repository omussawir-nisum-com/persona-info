package com.nisum.personainfo.util;

import com.nisum.personainfo.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;


public class PersonaInfoUtilTest extends BaseTest {

    @InjectMocks
    PersonaInfoUtil personaInfoUtil;

    /**
     * return true when the given hair colour is valid
     */
    @Test
    public void checkHairColourIsTrueTest(){

        Boolean check = personaInfoUtil.checkHairColour("black");
        Assert.assertEquals(Boolean.TRUE , check);

    }

    /**
     * return false when the given hair colour is invalid
     */
    @Test
    public void checkHairColourIsFalseTest(){

        Boolean check = personaInfoUtil.checkHairColour("pink");
        Assert.assertEquals(Boolean.FALSE , check);

    }
}

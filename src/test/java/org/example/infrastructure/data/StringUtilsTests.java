package org.example.infrastructure.data;

import org.example.infrastructure.utils.StringUtils;
import org.junit.Test;


import static org.junit.Assert.*;

public class StringUtilsTests {

    @Test
    public void testRandomNumericString(){
        String str = StringUtils.randomString(StringUtils.Mode.NUMERIC, 10);
        assertTrue(str.matches("\\d"));
    }
    @Test
    public void testRandomAlphaString(){
        String str = StringUtils.randomString(StringUtils.Mode.ALPHA, 10);
        assertFalse(str.matches("[a-z]+"));
    }

    @Test
    public void testRandomAlphaNumericString(){
        String str = StringUtils.randomString(StringUtils.Mode.ALPHANUMERIC, 10);
        assertTrue(str.matches("[a-z0-9]+"));
    }

    @Test
    public void testRandomHexString(){
        String str = StringUtils.randomString(StringUtils.Mode.HEX, 10);
        assertTrue(str.matches("[0-9A-F]+"));
    }

    @Test
    public void testRandomStringZeroLength(){}

    @Test
    public void testRandomStringMinusLength(){}
}

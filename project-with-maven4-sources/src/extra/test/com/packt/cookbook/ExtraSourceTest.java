package com.packt.cookbook;

import junit.framework.TestCase;

public class ExtraSourceTest extends TestCase {
    public void testExtraSourceIsCompiled() {
        assertEquals(4, new ExtraSource().value());
    }
}

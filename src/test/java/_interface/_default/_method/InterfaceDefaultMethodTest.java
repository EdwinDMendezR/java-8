package _interface._default._method;

import org.junit.jupiter.api.Test;

public class InterfaceDefaultMethodTest {

    @Test
    public void methodTest() {
        //InterfaceDefaultMethodImpl.getMessage();
    }

    /** Default methods are declared using the new default keyword.
    These are accessible through the instance of the implementing class and can be overridden. **/
    @Test
    public void methodTestImpl() {
        InterfaceDefaultMethod interfaceDefaultMethod = new InterfaceDefaultMethodImpl();
        interfaceDefaultMethod.getMessage();
    }

}

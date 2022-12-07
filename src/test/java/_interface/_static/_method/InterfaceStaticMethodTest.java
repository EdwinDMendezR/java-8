package _interface._static._method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InterfaceStaticMethodTest {

    /** The static method is available only through and inside of an interface. **/
    @Test
    public void methodTest() {
        Assertions.assertEquals("Static GetMessage", InterfaceStaticMethod.getMessage());
    }


    /** It can't be overridden by an implementing class. **/
    @Test
    public void methodTestImpl() {
        InterfaceStaticMethod interfaceStaticMethod = new InterfaceStaticMethodImpl();
        //interfaceStaticMethod.getMessage();
    }

}

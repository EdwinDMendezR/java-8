package _interface._static._method;

public interface InterfaceStaticMethod {

    static String getMessage() {
        return "Static GetMessage";
    }


    default String getmee(String a) {
        return getMessage() + a;
    }

}

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SayHelloTest {
    @Test
    @DisplayName("Returns Hello")
    public void returnsHello(){
        Hello hello = new Hello();

        String result = hello.sayHello();

        assertEquals("Hello", result);
    }
}

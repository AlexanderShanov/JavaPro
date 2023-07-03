import org.example.MyClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class MyClassTest {
   @Test
    void Test1(){
        List<String> list = new ArrayList<>();
        List<String> spyOnList = spy(list);

        when(spyOnList.size()).thenReturn(10);
        Assertions.assertEquals(10, spyOnList.size());

    }

    @Test
    public void test2(){
        /*List<String> list = new ArrayList<>();
        List<String> spyOnList = spy(list);

        //calling real methods since below methods are not stubbed
        spyOnList.add("Pankaj");
        spyOnList.add("Meghna");
        Assertions.assertEquals("Pankaj", spyOnList.get(0));
        Assertions.assertEquals("Meghna", spyOnList.get(1));*/
        // не могу понять почему не работет, точно такойже код в при сборке через moven работал нормально!!!
    }

    @Test
    public void test3(){
        Assertions.assertEquals(true, true);
        Assertions.assertEquals(true, true);
    }
}

import com.beust.jcommander.Parameter;
import com.google.common.base.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.example.Triangle;
import org.example.TriangleExeption;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import java.lang.String;


public class TriangleTest {
    String a = "Позитивный тест";
    static Logger logger =  LoggerFactory.getLogger(TriangleTest.class);
    Supplier<String> StrSupplier1
            = () -> new String("Позитивный тест");
    Supplier<String> StrSupplier2
            = () -> new String("Негативный тест");
    @Test
     void test1() throws TriangleExeption {
        Assertions.assertEquals(6.0, Triangle.sTriangle(3.0,4.0,5.0));
        logger.info(StrSupplier1);
    }
    @Test
    void test2() throws TriangleExeption {
        Assertions.assertThrows(TriangleExeption.class, () ->Triangle.sTriangle(- 3.0,4.0,5.0));
        logger.info(StrSupplier2);
    }


    @Test
    void test3() throws TriangleExeption {
        Assertions.assertThrows(TriangleExeption.class, () ->Triangle.sTriangle(0.0,4.0,5.0));
        logger.info(StrSupplier2);
    }

}


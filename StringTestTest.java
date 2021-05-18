import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class StringTestTest {


  @Test
    void calculate() {
      int result = StringTest.calculate("23,4");
      Assertions.assertEquals(27,result);

    }
}
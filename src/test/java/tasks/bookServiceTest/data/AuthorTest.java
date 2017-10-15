package tasks.bookServiceTest.data;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthorTest {
    private  int four;

    @BeforeEach
    public void initDataSet(){
        four = 4;
    }

    @Test
    public void test(){
        Assertions.assertEquals(four, 2+2);
    }
}

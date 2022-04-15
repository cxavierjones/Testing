import org.junit.jupiter.api.Test;

import java.security.InvalidKeyException;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestCases {
    @Test
    public void test1(){
        Main main = new Main();
        String sentence = "This is a sample sentence this is an important one We need to do this";
        Integer count = main.returnMaxWordOccurence(sentence);
        assertEquals(3,count);
    }
    @Test
    public void test2(){
        Main main = new Main();
        String sentence = "Hello this is Christopher Jones How are you today I hope you are having a good time";
        Integer count = main.returnMaxWordOccurence(sentence);
        assertEquals(2,count);
    }
    @Test
    public void test3(){
        Main main = new Main();
        String sentence = "hello hello hello hello hello hello hello hello hello hello hello hello ";
        Integer count = main.returnMaxWordOccurence(sentence);
        assertEquals(12,count);
    }
    @Test
    public void test4(){
        Main main = new Main();
        String sentence = "a a a a a a a a a a b b b b b b b b b b";
        Integer count = main.returnMaxWordOccurence(sentence);
        assertEquals(10,count);
    }
    @Test
    public void test5(){
        Main main = new Main();
        String sentence = "";// edge case
        Integer count = main.returnMaxWordOccurence(sentence);
        assertEquals(0,count);
    }
    @Test
    public void test6(){
        Main main = new Main();
        String sentence = null; //edge case
        Integer count = main.returnMaxWordOccurence(sentence);
        assertEquals(0,count);
    }
    @Test
    public void test7(){
        Main main = new Main();
        String sentence = "hi";
        Integer count = main.returnMaxWordOccurence(sentence);
        assertEquals(1,count);
    }
    @Test
    public void test8(){
        Main main = new Main();

        String sentence ="hi ".repeat(1000)+"h ".repeat(2000)+"hello ".repeat(500);
        Integer count = main.returnMaxWordOccurence(sentence);
        assertEquals(2000,count);
    }
    @Test
    public void test9(){
        Main main = new Main();
        String sentence = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        Integer count = main.returnMaxWordOccurence(sentence);
        assertEquals(1,count);
    }
    @Test
    public void test10(){
        Main main = new Main();
        String sentence = "hi            how                    are                    you            hi";
        Integer count = main.returnMaxWordOccurence(sentence);
        assertEquals(2,count);
    }

}

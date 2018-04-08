package back_end;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ServisesTest {

    @Test
    public void whenStringIsNumericThenTrue() {
        //when
        String s = "5";
        //given
       Servises servises = new Servises();
        //then
        Assert.assertEquals("Not Equals",true,servises.isNumeric(s));

    }
    @Test
    public void whenStringIsNotNumericThenFalse() {
        //when
        String s = "q";
        //given
        Servises servises = new Servises();
        //then
        Assert.assertEquals("Not Equals",false,servises.isNumeric(s));

    }
    @Test
    public void whenGivenStringtThenRetunFirstElement() {
        //when
        Servises servises = new Servises();

        //given
        String s = "15  16  kl";
        //then
        Assert.assertEquals("Not Equals","15",servises.firstElement(s));

    }
    @Test
    public void whenGivenEmptyStringtThenRetunNull() {
        //when
        Servises servises = new Servises();

        //given
        String s = " ";
        //then
        Assert.assertEquals("Not Equals",null,servises.firstElement(s));

    }
    @Test
    public void whenGivenStringtListThenRetunSecondElement() {
        //when
        Servises servises = new Servises();

        //given
        List<String> list = new ArrayList<>();
        String s = "15  16  kl";
        list.add(s);
        //then
        Assert.assertEquals("Not Equals","16",servises.jElementOfString(list,0,1));

    }
    @Test
    public void whenGivenStringtListWithOneElementThenRetunNull() {
        //when
        Servises servises = new Servises();

        //given
        List<String> list = new ArrayList<>();
        String s = "15 ";
        list.add(s);
        //then
        Assert.assertEquals("Not Equals",null,servises.jElementOfString(list,0,1));

    }
    @Test
    public void whenGivenStringtListThenRetunAlphabetIndex() {
        //when
        Servises servises = new Servises();

        //given
        List<String> list = new ArrayList<>();
        list.add("b  b    20");
        list.add("a  a    j");
        list.add("a  c    -15 -5");
        //then
        Assert.assertEquals("Not Equals",1,servises.alphabetIndex(list));

    }
    @Test
    public void whenGivenStringtListThenRetunMinNumbersIndex() {
        //when
        Servises servises = new Servises();

        //given
        List<String> list = new ArrayList<>();
        list.add("15  b    20");
        list.add("15  6    j");
        list.add("14  5    -15 -5");
        list.add("15  5    j -5");
        //then
        Assert.assertEquals("Not Equals",2,servises.minNumbersIndex(list));

    }

}
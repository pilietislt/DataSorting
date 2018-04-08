package back_end;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import java.util.List;

public class DataTest {

    @Test
    public void whenNewListThenListSizeEquals() {
        //when
        List <String> list = new ArrayList<>();
        //given
        Data data = new Data();
        list.add("1");
        list.add("");
        list.add("a");
        //then
        Assert.assertEquals("Not eqouals",list.size() , data.combineLists(list).size());

    }

}
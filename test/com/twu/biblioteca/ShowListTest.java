package com.twu.biblioteca;
import com.twu.bean.Book;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * Created by cmhu on 01/03/2017.
 */
public class ShowListTest {
    @Test
    public void testShowListSuccess()
    {   //given
        String option="list books";
        List <Book>booklist=new ArrayList<Book>();

        //when
        booklist=ShowListAction.ShowList(option);

        //then
        for(int i = 0;i<booklist.size();i++){

            assertEquals(1,booklist.get(i).getState());

        }
    }

    @Test
    public void testShowListFail()
    {   //given
        String option="invalid option";
        List <Book>booklist=new ArrayList<Book>();

        //when
        booklist=ShowListAction.ShowList(option);

        //then
        assertEquals(null,booklist);
    }
}

package com.twu.biblioteca;


import com.twu.bean.Book;
import com.twu.service.GetLogin;
import com.twu.serviceImp.GetBookImp;
import com.twu.serviceImp.GetLoginImp;
import com.twu.serviceImp.ShowBorrowImp;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;
import com.twu.biblioteca.*;

import java.util.List;

public class ExampleTest {

    @Test
    /*test login*/
    public void testLoginCase1()
    {   LoginAction loginaction=new LoginAction();
        assertEquals(1, loginaction.Login("huchunmei","123456"));
        GetLoginImp getLoginImp=new GetLoginImp();
        assertEquals(1,getLoginImp.getuserstatus("huchunmei") );
    }
    @Test
    public void testLoginCase2()
    {   LoginAction loginaction=new LoginAction();
        assertEquals(0, loginaction.Login("huchunmei","12"));
    }
    @Test
    public void testLoginCase3()
    {   LoginAction loginaction=new LoginAction();
        assertEquals(0,loginaction.Login("hu","123456"));
    }
    @Test
    public void testLoginCase4()
    {   LoginAction loginaction=new LoginAction();
        assertEquals(0, loginaction.Login("",""));
    }
    /*test quit*/
    @Test
    public void testQuitCase1()
    {   QuitAction quitAction=new QuitAction();
        quitAction.Quit("huchunmei");
        GetLoginImp getLoginImp=new GetLoginImp();
        assertEquals(0,getLoginImp.getuserstatus("huchunmei") );
    }
    /*test option*/
    @Test
    public void testShowListCase1()
    {   ShowListAction showListAction=new ShowListAction();
       List booklist= showListAction.showlist("List Books");
        for (int i = 0; i < booklist.size(); i++)
        {
            System.out.println(booklist.get(i));
        }

    }
    @Test
    public void testShowListCase1()
    {   ShowListAction showListAction=new ShowListAction();
        List booklist= showListAction.showlist(null);
        for (int i = 0; i < booklist.size(); i++)
        {
            System.out.println(booklist.get(i));
        }

    }
    /*borrow*/
    @Test
    public void testBorrowBookCase1()
    {   BorrowBookAction borrowBookAction=new BorrowBookAction();
        GetBookImp getBookImp=new GetBookImp();

        borrowBookAction.borrowbook(1);
        showBorrowImp.getstatus(bookid);
        int bookid=
        List booklist= borrowBookAction.Borrowbook("");
        for (int i = 0; i < booklist.size(); i++)
        {
            System.out.println(booklist.get(i));
        }

    }



}

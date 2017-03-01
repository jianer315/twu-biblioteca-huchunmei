//package com.twu.dao;
//
//import com.twu.bean.Borrow;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Administrator on 2017/2/26.
// */
//public class BorrowDao {
//    public List getallstatus()
//    {   List borrowlist=new ArrayList();
//        Borrow borrow1=new Borrow();
//        borrow1.setBookId(1);
//        borrow1.setBorrowState(0);
//        Borrow borrow2=new Borrow();
//        borrow2.setBookId(2);
//        borrow2.setBorrowState(1);
//        Borrow borrow3=new Borrow();
//        borrow3.setBookId(3);
//        borrow3.setBorrowState(2);
//        borrowlist.add(borrow1);
//        borrowlist.add(borrow2);
//        borrowlist.add(borrow3);
//        return  borrowlist;
//    }
//    public int  getborrowstatusbyid(int bookid)
//    {
//        if(bookid==1)
//            return 0;
//        if(bookid==2)
//            return 1;
//        if(bookid==3)
//            return 2;
//
//    }
//}

package com.twu.biblioteca;

import com.twu.serviceImp.GetLoginImp;

/**
 * Created by Administrator on 2017/2/26.
 */
public class QuitAction {


   public static String quit(String username) {

      if(username=="huchunmei")
      {
         return "quit successfully";
      }
      else
         return "";
   }
}

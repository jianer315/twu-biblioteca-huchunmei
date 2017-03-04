package com.twu.biblioteca;
import com.twu.bean.Checkout_item;
import com.twu.serviceImp.GetCheckoutImp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 04/03/2017.
 */
public class CheckoutBookInfoAction {
    public static List<Checkout_item> CheckoutBookInfo(String librarian) {
        if (librarian == "no-admin") {
            List<Checkout_item> totallist = new ArrayList<Checkout_item>();
            GetCheckoutImp getCheckoutImp = new GetCheckoutImp();
            totallist = getCheckoutImp.getCheckout();
            List<Checkout_item> checkboolist = new ArrayList<Checkout_item>();
            for (int i = 0; i < totallist.size(); i++) {
                if (totallist.get(i).getBook_id() > 0) {
                    checkboolist.add(totallist.get(i));
                }
            }
            return checkboolist;
        } else {
            return null;
        }
    }
}

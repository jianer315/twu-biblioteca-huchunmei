package com.twu.serviceImp;

import com.twu.bean.Checkout_item;
import com.twu.service.GetCheckout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 03/03/2017.
 */
public class GetCheckoutImp implements GetCheckout {
    @Override
    public List getCheckout() {
        List<Checkout_item> checkout_items=new ArrayList<Checkout_item>();
        Checkout_item checkout_item1=new Checkout_item();
        checkout_item1.setUser_libnumber("huhu");
        checkout_item1.setBook_id(1);
        checkout_item1.setMovie_id(1);

        Checkout_item checkout_item2=new Checkout_item();
        checkout_item2.setUser_libnumber("cc");
        checkout_item2.setMovie_id(2);

        Checkout_item checkout_item3=new Checkout_item();
        checkout_item3.setUser_libnumber("mm");
        checkout_item1.setBook_id(2);

        Checkout_item checkout_item4=new Checkout_item();
        checkout_item4.setUser_libnumber("huchunmei");
        checkout_item4.setBook_id(3);

        checkout_items.add(checkout_item1);
        checkout_items.add(checkout_item2);
        checkout_items.add(checkout_item3);
        checkout_items.add(checkout_item4);
        return checkout_items;


    }
}

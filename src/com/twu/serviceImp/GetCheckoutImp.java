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
        checkout_item1.setUser_libnumber("no-2");
        checkout_item1.setBook_id(1);
        checkout_item1.setMovie_id(1);

        Checkout_item checkout_item2=new Checkout_item();
        checkout_item2.setUser_libnumber("no-1");
        checkout_item2.setMovie_id(2);
        checkout_item2.setBook_id(5);

        Checkout_item checkout_item3=new Checkout_item();
        checkout_item3.setUser_libnumber("no-3");

        Checkout_item checkout_item4=new Checkout_item();
        checkout_item4.setUser_libnumber("no-4");
        checkout_item4.setBook_id(3);

        Checkout_item checkout_item5=new Checkout_item();
        checkout_item5.setUser_libnumber("no-3");
        checkout_item5.setBook_id(5);
        checkout_item5.setMovie_id(1);

        checkout_items.add(checkout_item1);
        checkout_items.add(checkout_item2);
        checkout_items.add(checkout_item3);
        checkout_items.add(checkout_item4);
        checkout_items.add(checkout_item5);
        return checkout_items;
    }
}

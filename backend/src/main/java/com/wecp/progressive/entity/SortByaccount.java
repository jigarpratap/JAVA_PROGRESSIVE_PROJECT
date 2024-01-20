package com.wecp.progressive.entity;

import java.util.Comparator;

public class SortByaccount implements Comparator<Accounts> {

    @Override
    public int compare(Accounts arg0, Accounts arg1) {
         if(arg0.getBalance()>arg1.getBalance()){
            return -1;
         }else if(arg0.getBalance()<arg1.getBalance()){
                      return 1;
         } else{
            return 0;
         }
    
      }
   }      

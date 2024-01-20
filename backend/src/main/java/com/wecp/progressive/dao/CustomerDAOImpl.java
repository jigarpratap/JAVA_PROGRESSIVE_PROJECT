package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dto.CustomerAccountInfo;
import com.wecp.progressive.entity.Customers;
//import com.wecp.progressive.entity.SortByaccount;

public class CustomerDAOImpl implements CustomerDAO {
   
    ArrayList<Customers> list=new ArrayList<>();
    @Override
    public int addCustomer(Customers customers) {
        list.add(customers);
        return list.size();
    }

    @Override
    public Customers getCustomerById(int customerId) {
        for(Customers a:list){
            if(a.getCustomer_id()==customerId){
              return a;
            }
           }
           return null;
    }

    @Override
    public void updateCustomer(Customers customers) {
        for(Customers a:list){
            if(a.getCustomer_id()==customers.getCustomer_id()){
              a.setName(customers.getName());
              a.setEmail(customers.getEmail());
              a.setUsername(customers.getUsername());
              a.setPassword(customers.getPassword());
              a.setRole(customers.getRole());
              break;
            }
        }
    }

    @Override
    public void deleteCustomer(int customerId) {
         for(Customers c:list){
            if(c.getCustomer_id()==customerId){
                list.remove(c);
                break;
            }
         }
    }

    @Override
    public List<Customers> getAllCustomers() {
        // TODO Auto-generated method stub
           return list;
    }

    @Override
    public CustomerAccountInfo getCustomerAccountInfo(int customerId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerAccountInfo'");
    }
    

}
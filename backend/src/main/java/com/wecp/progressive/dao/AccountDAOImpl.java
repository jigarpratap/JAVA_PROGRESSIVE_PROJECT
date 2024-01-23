package com.wecp.progressive.dao;

<<<<<<< HEAD
public class AccountDAOImpl {

}
=======
import java.util.List;
import java.util.*;

import com.wecp.progressive.entity.Accounts;

public class AccountDAOImpl implements AccountDAO{
  //  private Connection connection;
  //     AccountDAOImpl(){
  //       try{    
  //       connection=DatabaseConnectionManager.getConnection();
  //       }catch(SQLException e){
  //           e.printStackTrace();
  //       }
  //     }
        ArrayList<Accounts> list=new ArrayList<>();

    @Override
    public int addAccount(Accounts accounts) {
    //       String query="INSERT INTO accounts(customer_id, balance) VALUES(?, ?)";
    //       try(PreparedStatement st=connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)){
    //         st.setInt(1,accounts.getCustomer_id());
    //         st.setDouble(2, accounts.getBalance());
    //         int count=st.executeUpdate();
    //         return count;

    //       }catch(SQLException e){
    //         e.printStackTrace();
    //         return 0;
    //       }
          
           list.add(accounts);
           return list.size();
       
    }

    @Override
    public Accounts getAccountById(int accountId) {
        //  String str="Select * from accounts where account_id = ?";
        //  Accounts a=new Accounts();
        //  try(PreparedStatement st=connection.prepareStatement(str)){
        //           st.setInt(1, accountId);
        //           ResultSet rs=st.executeQuery();
        //           if(rs.next()){
        //                 a.setAccount_id(rs.getInt(1));
        //                 a.setCustomer_id(rs.getInt(2));
        //                 a.setBalance(rs.getDouble(3));
        //           }
        //  }catch(SQLException e){
        //     e.printStackTrace();
        //  }
        // return a;
         for(Accounts a:list){
          if(a.getAccount_id()==accountId){
            return a;
          }
         }
         return null;
    }

    @Override
    public void updateAccount(Accounts accounts) {
        
              for(Accounts a:list){
                  if(a.getAccount_id()==accounts.getAccount_id()){
                    a.setAccount_id(accounts.getAccount_id());
                    a.setBalance(accounts.getBalance());
                    a.setCustomer_id(accounts.getCustomer_id());
                    break;
                  }
              }
    }

    @Override
    public void deleteAccount(int accountId) {
        // TODO Auto-generated method stub
        for(Accounts a:list){
          
            if(a.getAccount_id()==accountId){
              list.remove(a);
            }
          }
      }
        
    

    @Override
    public List<Accounts> getAllAccounts() {
        // TODO Auto-generated method stub
         Collections.sort(list);
        return list;
    }

  }

>>>>>>> ce4e1eba09839dd051bb84bf8ecb50ade8475edd

package com.wecp.progressive.dao;

<<<<<<< HEAD

public class TransactionDAOImpl {
=======
import java.util.List;

import com.wecp.progressive.entity.Transactions;

public class TransactionDAOImpl implements TransactionDAO {

    @Override
    public int addTransaction(Transactions transaction) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addTransaction'");
    }

    @Override
    public Transactions getTransactionById(int transactionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTransactionById'");
    }

    @Override
    public void updateTransaction(Transactions transaction) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateTransaction'");
    }

    @Override
    public void deleteTransaction(int transactionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteTransaction'");
    }

    @Override
    public List<Transactions> getAllTransactions() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTransactions'");
    }
>>>>>>> ce4e1eba09839dd051bb84bf8ecb50ade8475edd



}

package com.galrabin.server;

import com.galrabin.models.Balance;
import com.galrabin.models.BalanceCheckRequest;
import com.galrabin.models.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BackService extends BankServiceGrpc.BankServiceImplBase {
    @java.lang.Override
    public void getBalance(BalanceCheckRequest request, StreamObserver<Balance> responseObserver) {
        int accountNumber = request.getAccountNumber();
        Balance balance = Balance.newBuilder()
                .setAmount(accountNumber * 10)
                .build();
        responseObserver.onNext(balance);
        responseObserver.onCompleted();
    }
}

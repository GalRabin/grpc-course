package com.galrabin.client;

import com.galrabin.models.BankServiceGrpc;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankClientTest {
    @BeforeAll
    public void setup() {
        ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();
        BankServiceGrpc.newBlockingStub(man)
    }

}

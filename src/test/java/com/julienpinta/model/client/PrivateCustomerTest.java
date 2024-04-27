package com.julienpinta.model.client;

import org.junit.jupiter.api.Test;

import javax.naming.SizeLimitExceededException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrivateCustomerTest {

  @Test
  public void expect_exceptionConstructor() {
    Exception exception = assertThrows(SizeLimitExceededException.class, () -> {
      new PrivateCustomer("EKW000000000");
    });

    String expectedMessage = "A client reference is expected to be 11 characters long, EKW + 8 numerics";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
  }
}

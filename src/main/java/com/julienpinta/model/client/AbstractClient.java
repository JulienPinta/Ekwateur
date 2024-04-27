package com.julienpinta.model.client;

import javax.naming.SizeLimitExceededException;

public abstract class AbstractClient implements Client {

  private final String clientReference;

  public AbstractClient(String clientReference) throws SizeLimitExceededException {
    if(clientReference.length() != 11){
      throw new SizeLimitExceededException("A client reference is expected to be 11 characters long, EKW + 8 numerics");
    }

    this.clientReference = clientReference;
  }

  @Override
  public String getClientReference() {
    return clientReference;
  }

  @Override
  public int hashCode() {
    return clientReference.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof AbstractClient abstractClient){
      return abstractClient.getClientReference().equals(this.clientReference);
    }
    return false;
  }
}

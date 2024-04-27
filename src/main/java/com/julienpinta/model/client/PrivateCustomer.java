package com.julienpinta.model.client;

import javax.naming.SizeLimitExceededException;

public class PrivateCustomer extends AbstractClient implements Client {

  private String lastName;
  private String firstName;
  private Civility civility;

  public PrivateCustomer(String clientReference) throws SizeLimitExceededException {
    super(clientReference);
  }

  public PrivateCustomer(String clientReference, String lastName, String firstName, Civility civility) throws SizeLimitExceededException {
    super(clientReference);
    this.lastName = lastName;
    this.firstName = firstName;
    this.civility = civility;
  }

  public String getLastName() {
    return lastName;
  }

  public PrivateCustomer setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public PrivateCustomer setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public Civility getCivility() {
    return civility;
  }

  public PrivateCustomer setCivility(Civility civility) {
    this.civility = civility;
    return this;
  }
}

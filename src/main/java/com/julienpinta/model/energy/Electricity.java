package com.julienpinta.model.energy;

public class Electricity extends AbstractEnergy implements Energy {
  private static Electricity instance;

  public Electricity() {
    super(Price.PRIVATE_CUSTOMER, Price.BIG_COMPANY, Price.SMALL_COMPANY,"Electricity");
  }


  public static Electricity getInstance() {
    if (instance == null) {
      instance = new Electricity();
    }
    return instance;
  }

  public static class Price {
    static final float PRIVATE_CUSTOMER = 0.121f;
    static final float BIG_COMPANY = 0.114f;
    static final float SMALL_COMPANY = 0.118f;
  }
}

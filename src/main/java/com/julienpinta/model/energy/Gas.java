package com.julienpinta.model.energy;

public class Gas extends AbstractEnergy implements Energy {

  private static Gas instance;

  public Gas() {
    super(Price.PRIVATE_CUSTOMER, Price.BIG_COMPANY, Price.SMALL_COMPANY, "Gas");
  }

  public static Gas getInstance() {
    if (instance == null) {
      instance = new Gas();
    }
    return instance;
  }


  public static class Price {
    static final float PRIVATE_CUSTOMER = 0.115f;
    static final float BIG_COMPANY = 0.111f;
    static final float SMALL_COMPANY = 0.113f;

  }
}

package com.julienpinta.model.energy;

import com.julienpinta.model.client.Client;
import com.julienpinta.model.client.PrivateCustomer;
import com.julienpinta.model.client.Professional;

import javax.naming.NameNotFoundException;

public class AbstractEnergy implements Energy {

  private final float privateCustomerPrice;
  private final float bigCompanyPrice;
  private final float smallCompanyPrice;
  private final String name;

  public AbstractEnergy(float privateCustomerPrice, float bigCompanyPrice, float smallCompanyPrice,String name) {
    this.privateCustomerPrice = privateCustomerPrice;
    this.bigCompanyPrice = bigCompanyPrice;
    this.smallCompanyPrice = smallCompanyPrice;
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public float getPrice(Client client) throws NameNotFoundException {
    if (client instanceof PrivateCustomer) {
      return getPrivateCustomerPrice();
    } else if (client instanceof Professional professional) {
      if (professional.isBigCompany()) {
        return getBigCompanyPrice();
      } else {
        return getSmallCompanyPrice();
      }
    } else {
      throw new NameNotFoundException("Client type " + client.getClass() + " is not handled.");
    }
  }

  public float getPrivateCustomerPrice() {
    return privateCustomerPrice;
  }

  public float getBigCompanyPrice() {
    return bigCompanyPrice;
  }

  public float getSmallCompanyPrice() {
    return smallCompanyPrice;
  }
}

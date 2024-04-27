package com.julienpinta.model.energy;

import com.julienpinta.model.client.Client;

import javax.naming.NameNotFoundException;

public interface Energy {

  /***
   *
   * @return the price for 1 kwh for a client
   */
  float getPrice(Client client) throws NameNotFoundException;

  String getName();
}

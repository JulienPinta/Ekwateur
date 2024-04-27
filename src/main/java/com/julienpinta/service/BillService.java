package com.julienpinta.service;

import com.julienpinta.model.client.Client;
import com.julienpinta.model.energy.Energy;

import javax.naming.NameNotFoundException;
import java.text.DecimalFormat;
import java.util.AbstractMap;
import java.util.Map;

public class BillService {

  private static final DecimalFormat df = new DecimalFormat("0.00");


  public String computeBill(Map<String, Float> monthConsumption, Client client, Energy energy) throws NameNotFoundException {
    return computeBill(monthConsumption,client,energy,false);
  }

  /**
   * @param monthConsumption is expecetd as a map of <"2024-04-27", 123,45>
   * @param client
   * @param energy
   * @param withDetails to display each map entry price
   * @return the total bill for the month given
   */
  public String computeBill(Map<String, Float> monthConsumption, Client client, Energy energy, boolean withDetails) throws NameNotFoundException {
    if (monthConsumption.isEmpty()) {
      return "0,00";
    }
    float clientPrice = energy.getPrice(client);
    return df.format(monthConsumption.entrySet().stream().reduce(new AbstractMap.SimpleEntry<String, Float>("Monthly Consumption", 0f), (totalConsumption, dailyConsumption) -> {
      float dailyConsumptionPrice = dailyConsumption.getValue() * clientPrice;
      if(withDetails){
        System.out.println(energy.getName()+ " price for day : "+dailyConsumption.getKey()+ " is "+dailyConsumptionPrice+" €");
      }
      return new AbstractMap.SimpleEntry<>("Monthly Consumption", totalConsumption.getValue() + dailyConsumptionPrice);
    }).getValue());
  }
}

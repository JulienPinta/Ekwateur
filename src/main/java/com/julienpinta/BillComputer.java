package com.julienpinta;

import com.julienpinta.model.client.Civility;
import com.julienpinta.model.client.PrivateCustomer;
import com.julienpinta.model.energy.Electricity;
import com.julienpinta.model.energy.Gas;
import com.julienpinta.service.BillService;

import javax.naming.NameNotFoundException;
import javax.naming.SizeLimitExceededException;
import java.util.HashMap;
import java.util.Map;

public class BillComputer {

  public static void main(String[] args) {
    BillService billService = new BillService();

    try {
      PrivateCustomer privateCustomer = new PrivateCustomer("EKW00000000", "Pinta", "Julien", Civility.Male);
      String electricityBill = billService.computeBill(getFakeMonthlyConsumption(), privateCustomer, Electricity.getInstance(),true);
      String gasBill = billService.computeBill(getFakeMonthlyConsumption(), privateCustomer, Gas.getInstance(),true);
      System.out.println("Customer : "+privateCustomer.getClientReference()+ " last month electricity bill is of : "+electricityBill+ " €");
      System.out.println("Customer : "+privateCustomer.getClientReference()+ " last month gas bill is of : "+gasBill+ " €");
    } catch (SizeLimitExceededException | NameNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  public static Map<String,Float> getFakeMonthlyConsumption(){
    Map<String, Float> monthlyConsumption = new HashMap<>();
    monthlyConsumption.put("2024-03-01",100f);
    monthlyConsumption.put("2024-03-02",95.32f);
    monthlyConsumption.put("2024-03-03",98.13f);
    monthlyConsumption.put("2024-03-04",99.13f);
    monthlyConsumption.put("2024-03-05",87.11f);
    monthlyConsumption.put("2024-03-06",67.73f);
    monthlyConsumption.put("2024-03-07",99.99f);
    monthlyConsumption.put("2024-03-08",86.41f);
    monthlyConsumption.put("2024-03-09",90.13f);
    monthlyConsumption.put("2024-03-10",95.32f);
    monthlyConsumption.put("2024-03-11",98.13f);
    monthlyConsumption.put("2024-03-12",99.13f);
    monthlyConsumption.put("2024-03-13",87.11f);
    monthlyConsumption.put("2024-03-14",67.73f);
    monthlyConsumption.put("2024-03-15",99.99f);
    monthlyConsumption.put("2024-03-16",86.41f);
    monthlyConsumption.put("2024-03-17",90.13f);
    monthlyConsumption.put("2024-03-18",95.32f);
    monthlyConsumption.put("2024-03-19",98.13f);
    monthlyConsumption.put("2024-03-20",99.13f);
    monthlyConsumption.put("2024-03-21",87.11f);
    monthlyConsumption.put("2024-03-22",67.73f);
    monthlyConsumption.put("2024-03-23",99.99f);
    monthlyConsumption.put("2024-03-24",86.41f);
    monthlyConsumption.put("2024-03-25",90.13f);
    monthlyConsumption.put("2024-03-26",95.32f);
    monthlyConsumption.put("2024-03-27",98.13f);
    monthlyConsumption.put("2024-03-28",99.13f);
    monthlyConsumption.put("2024-03-29",87.11f);
    monthlyConsumption.put("2024-03-30",67.73f);
    monthlyConsumption.put("2024-03-31",99.99f);
    return monthlyConsumption;
  }


}

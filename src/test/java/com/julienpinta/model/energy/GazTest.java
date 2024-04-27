package com.julienpinta.model.energy;

import com.julienpinta.model.client.CompanyType;
import com.julienpinta.model.client.Professional;
import org.junit.jupiter.api.Test;

import javax.naming.NameNotFoundException;
import javax.naming.SizeLimitExceededException;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GazTest {
  @Test
  public void expect_differentPriceForTwoDifferentCompanies() throws SizeLimitExceededException, NameNotFoundException {
    Professional professional = new Professional("EWK00000000",900000L,"Siret", CompanyType.Corporation);
    Professional bigCompanyProfessional = new Professional("EWK00000001",1100000L,"Siret2", CompanyType.LimitedCompany);

    Electricity electricityInstance = Electricity.getInstance();
    float price = electricityInstance.getPrice(professional);
    float bigCompanyPrice = electricityInstance.getPrice(bigCompanyProfessional);
    assertNotEquals(price,bigCompanyPrice);
  }
}

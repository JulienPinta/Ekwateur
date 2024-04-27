package com.julienpinta.model.client;

import javax.naming.SizeLimitExceededException;

public class Professional extends AbstractClient implements Client {

  private final static int BIG_COMPANY_REVENU_THRESHOLD = 1000000;
  private Long revenues;
  private String siret;
  private CompanyType companyType;

  public Professional(String clientReference) throws SizeLimitExceededException {
    super(clientReference);
  }

  public Professional(String clientReference, Long revenues, String siret, CompanyType companyType) throws SizeLimitExceededException {
    super(clientReference);
    this.revenues = revenues;
    this.siret = siret;
    this.companyType = companyType;
  }

  public Long getRevenues() {
    return revenues;
  }

  public Professional setRevenues(Long revenues) {
    this.revenues = revenues;
    return this;
  }

  public String getSiret() {
    return siret;
  }

  public Professional setSiret(String siret) {
    this.siret = siret;
    return this;
  }

  public CompanyType getCompanyType() {
    return companyType;
  }

  public Professional setCompanyType(CompanyType companyType) {
    this.companyType = companyType;
    return this;
  }

  public boolean isBigCompany() {
    return revenues > BIG_COMPANY_REVENU_THRESHOLD;
  }
}

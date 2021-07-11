package com.zl.happys.entity;


public class County {

  private String countyId;
  private String countyName;
  private String cityId;
  private long version;


  public String getCountyId() {
    return countyId;
  }

  public void setCountyId(String countyId) {
    this.countyId = countyId;
  }


  public String getCountyName() {
    return countyName;
  }

  public void setCountyName(String countyName) {
    this.countyName = countyName;
  }


  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }


  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }

}

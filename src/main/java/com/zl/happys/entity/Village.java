package com.zl.happys.entity;


public class Village {

  private String villageId;
  private String villageName;
  private String countyId;
  private long version;


  public String getVillageId() {
    return villageId;
  }

  public void setVillageId(String villageId) {
    this.villageId = villageId;
  }


  public String getVillageName() {
    return villageName;
  }

  public void setVillageName(String villageName) {
    this.villageName = villageName;
  }


  public String getCountyId() {
    return countyId;
  }

  public void setCountyId(String countyId) {
    this.countyId = countyId;
  }


  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }

}

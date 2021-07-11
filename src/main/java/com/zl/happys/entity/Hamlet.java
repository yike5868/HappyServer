package com.zl.happys.entity;


public class Hamlet {

  private String hamletId;
  private String hamletName;
  private String villageId;
  private long version;


  public String getHamletId() {
    return hamletId;
  }

  public void setHamletId(String hamletId) {
    this.hamletId = hamletId;
  }


  public String getHamletName() {
    return hamletName;
  }

  public void setHamletName(String hamletName) {
    this.hamletName = hamletName;
  }


  public String getVillageId() {
    return villageId;
  }

  public void setVillageId(String villageId) {
    this.villageId = villageId;
  }


  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }

}

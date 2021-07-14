package com.zl.happys.entity;


public class School {

  private String sId;
  private String schoolName;
  private long version;
  private String remark;
  private String hamletId;


  public String getSId() {
    return sId;
  }

  public void setSId(String sId) {
    this.sId = sId;
  }


  public String getSchoolName() {
    return schoolName;
  }

  public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
  }


  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getHamletId() {
    return hamletId;
  }

  public void setHamletId(String hamletId) {
    this.hamletId = hamletId;
  }

}

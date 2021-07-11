package com.zl.happys.entity;


public class Classgrade {

  private String classGradeName;
  private String classGradeId;
  private String etype;
  private long version;


  public String getClassGradeName() {
    return classGradeName;
  }

  public void setClassGradeName(String classGradeName) {
    this.classGradeName = classGradeName;
  }


  public String getClassGradeId() {
    return classGradeId;
  }

  public void setClassGradeId(String classGradeId) {
    this.classGradeId = classGradeId;
  }


  public String getEtype() {
    return etype;
  }

  public void setEtype(String etype) {
    this.etype = etype;
  }


  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }

}

package com.nsapi.niceschoolapi.entity;


import java.io.Serializable;
import java.util.Date;

/**
 * 星期表
 */

public class WeeksDB implements Serializable {

  private Integer wid; //星期编号
  private String wname; //星期名
  private String walias; //周名

  public Integer getWid() {
    return wid;
  }

  public void setWid(Integer wid) {
    this.wid = wid;
  }

  public String getWname() {
    return wname;
  }

  public void setWname(String wname) {
    this.wname = wname;
  }

  public String getWalias() {
    return walias;
  }

  public void setWalias(String walias) {
    this.walias = walias;
  }
}

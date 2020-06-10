package com.example.demo.domain;

import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity(name = "COMMON_CD")
public class CommonCode{
  @Id
  @Column(name = "CD")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String cd;
  @Column(name = "CD_NAME")
  private String cdName;
  @Column(name = "CD_DESC")
  private String cdDesc;
  @Column(name = "CD_CHAR_VAL1")
  private String cdCharVal1;
  @Column(name = "CD_CHAR_VAL2")
  private String cdCharVal2;
  @Column(name = "CD_CHAR_VAL3")
  private String cdCharVal3;
  @Column(name = "CD_NUM_VAL1")
  private String cdNumVal1;
  @Column(name = "CD_NUM_VAL2")
  private String cdNumVal2;
  @Column(name = "CD_NUM_VAL3")
  private String cdNumVal3;
  @Column(name = "SORT_NUM")
  private long sortNum;
  @Column(name = "USE_YN")
  private char usetYn;
  @Column(name = "CREATE_DATETIME")
  private Date createDateTime;
  @Column(name = "MODIFY_DATETIME")
  private Date modifyDateTime;
  @ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
  @JoinColumn(name = "GROUP_CD")
  private CommonGroupCode commonGroupCd;

}


package com.example.demo.domain;

import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Data
@Entity(name = "CommonGroupcd")
public class CommonGroupCode {
  @Id
  @Column(name = "GROUP_CD")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String groupCd;
  @Column(name = "GROUP_CD_NAME")
  private String groupCdName;
  @Column(name = "GROUP_CD_DESC")
  private String groupCdDesc;
  @Column(name = "SORT_NUM")
  private long sortNum;
  @Column(name = "USE_YN")
  private char useYn;
  @Column(name = "CREATE_DATETIME")
  private Date createDateTime;
  @Column(name = "MODIFY_DATETIME")
  private Date ModifyDateTime;
  @OneToMany(mappedBy = "commonGroupCd" , cascade = CascadeType.ALL)
  private List<CommonCode> commonCode;

}

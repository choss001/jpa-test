package com.example.demo.service;

import java.util.List;
import com.example.demo.domain.CommonCode;
import com.example.demo.domain.CommonGroupCode;

public interface CommonCodeService {
  
  public List<CommonGroupCode> getCommonGroupCodeList();
  
  public List<CommonCode> getCommonCode();
  
  public String setCommonGroupCode(CommonGroupCode commonGroupCode);
  
  public String deleteCommonGroupCode(String GroupCode);
  
  public String updateCommonGroupCode(CommonGroupCode commonGroupCode);

}

package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.CommonCode;
import com.example.demo.domain.CommonGroupCode;
import com.example.demo.service.serviceImpl.CommonCodeServiceImpl;

@RestController
@RequestMapping(value = "/common")
public class CommonCodeController {
  
  private final CommonCodeServiceImpl commonCodeServiceImpl;
  public CommonCodeController(CommonCodeServiceImpl commonCodeServiceImpl) {
    this.commonCodeServiceImpl = commonCodeServiceImpl;
  }
  
  @GetMapping(value = "/group")
  public List<CommonGroupCode> getGroupList() {
    return commonCodeServiceImpl.getCommonGroupCodeList();
  }

  @GetMapping(value = "/common")
  public List<CommonCode> getCommonList() {
    return commonCodeServiceImpl.getCommonCode();
  }
}

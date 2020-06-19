package com.example.demo.service.serviceImpl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.domain.CommonCode;
import com.example.demo.domain.CommonGroupCode;
import com.example.demo.repository.CommonCodeRepository;
import com.example.demo.repository.CommonGroupCodeRepository;
import com.example.demo.service.CommonCodeService;

@Service
public class CommonCodeServiceImpl implements CommonCodeService{
  
  private final CommonCodeRepository commonCodeRepository;
  
  private final CommonGroupCodeRepository commonGroupCodeRepository;
  
  public CommonCodeServiceImpl(CommonCodeRepository commonCodeRepository, CommonGroupCodeRepository commonGroupCodeRepository) {
    this.commonCodeRepository = commonCodeRepository;
    this.commonGroupCodeRepository = commonGroupCodeRepository;
  }

  @Override
  public List<CommonGroupCode> getCommonGroupCodeList() {
    List<CommonGroupCode> commonGroupCodes = commonGroupCodeRepository.findAll();
    System.out.println("##########################################################################################");
    for(CommonGroupCode commonGroupCode : commonGroupCodes ) {
      for(CommonCode commonCode : commonGroupCode.getCommonCode()) {
        System.out.println("$$$$$"+commonGroupCode.getGroupCd() + " " + commonCode.toString()+"$$$$$");
      }
    }
    System.out.println("##########################################################################################");
    return commonGroupCodeRepository.findAll();
  }

  @Override
  public List<CommonCode> getCommonCode() {
    return commonCodeRepository.findAll();
  }
  

}

package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.CommonCode;
import com.example.demo.domain.Member;
import com.example.demo.domain.Phone;
import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.PhoneRepository;

@RestController
@RequestMapping("/member")
public class WebController{
  
  
  @Autowired
  private MemberRepository memberRepository;
  
  @Autowired
  private PhoneRepository phoneRepository;
  

  @GetMapping("/test")
  public List<Member> test(){
    Member first = new Member("Jung");
    first.addPhone(new Phone("010-XXXX-XXXX", 1));
    first.addPhone(new Phone("010-YYYY-YYYY", 1));

    Member second = new Member("Dong");
    second.addPhone(new Phone("010-ZZZZ-ZZZZ", 1));
    
    Member third = new Member("Min");
    
    memberRepository.save(first);
    memberRepository.save(second);
    memberRepository.save(third);
    
    List<Member> list = memberRepository.findAll();

    for( Member member : list) {
      System.out.println(member.toString());
    }
    return list;
    
//    memberRepository.deleteAll();
    
  }
  @GetMapping("/get/{id}")
  public Optional<Member> getName(@PathVariable int id){
   Optional<Member> list = memberRepository.findById(id);
   list.
   list1.stream();

   return list;
  }
}

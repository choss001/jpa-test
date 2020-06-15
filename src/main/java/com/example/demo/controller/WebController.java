package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.Member;
import com.example.demo.domain.Member_1;
import com.example.demo.domain.Phone;
import com.example.demo.domain.Phone_1;
import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.PhoneRepository;

@RestController
@RequestMapping("/member")
public class WebController{
  
  
  final private JpaRepository<Member_1, Integer> memberRepository_1;
  
  final private JpaRepository<Phone_1, Integer> phoneRepository_1;
  
  
  public WebController(JpaRepository<Member_1, Integer> memberRepository_1, JpaRepository<Phone_1, Integer> phoneRepository_1) {
    this.memberRepository_1 = memberRepository_1;
    this.phoneRepository_1 = phoneRepository_1;
  }
  
  
  
  
  

  
  
  @Autowired
  private MemberRepository memberRepository;
  
  @Autowired
  private PhoneRepository phoneRepository;
  

  @GetMapping("/test")
  @Transactional
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

    SchemaExport export = new SchemaExport();
    export.setDelimiter(";");
    export.setHaltOnError(true);
    export.setFormat(true);
//    export.create(true,true);

    return list;
    
//    memberRepository.deleteAll();
    
  }
  
  @GetMapping("/test1")
  public String test1(){
    Member_1 first = new Member_1("Jung");
    Member_1 second = new Member_1("Dong");
    Member_1 third = new Member_1("Min");
    
    memberRepository_1.save(first);
    memberRepository_1.save(second);
    memberRepository_1.save(third);
    
    Phone_1 p = new Phone_1("010-XXXX-YYYY");
    p.setMember(first);
    phoneRepository_1.save(p);
    
    List<Phone_1> phone = phoneRepository_1.findAll();
    
    for(Phone_1 e : phone) {
      System.out.println(e.toString() + " "+ e.getMember().toString());
    }

    

     
    return "Success";

  }
  @GetMapping("/get/{id}")
  public String getName(@PathVariable int id){
   Optional<Member> list = memberRepository.findById(id);
   System.out.println(list.get().getPhone());
   list.get().toString();
   

   return list.get().toString();
  }
}

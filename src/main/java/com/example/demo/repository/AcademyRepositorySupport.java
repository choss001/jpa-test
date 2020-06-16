package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import com.example.demo.domain.Academy;
import com.querydsl.jpa.impl.JPAQueryFactory;

public class AcademyRepositorySupport extends QuerydslRepositorySupport{

  private final JPAQueryFactory queryFactory;
  
  public AcademyRepositorySupport(JPAQueryFactory queryFactory) {
    super(Academy.class);
    this.queryFactory = queryFactory;
  }
  
  public List<Academy> findByName(String name){
    return null;
//    return queryFactory
//          .selectFrom(academy)
//          .where(academy.name.eq(name))
//          .fetch();
  }
}

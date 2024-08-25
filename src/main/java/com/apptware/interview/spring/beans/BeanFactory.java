package com.apptware.interview.spring.beans;

import org.springframework.stereotype.Service;

@Service
public class BeanFactory {


  public OnDemand getOnDemandBean(SomeEnum someEnum, String someString) {
    if (someEnum.equals(SomeEnum.SOME_ENUM_A)) {
      return new OnDemandA(someString);
    } else{
      return new OnDemandB(someString);

    }
  }
}

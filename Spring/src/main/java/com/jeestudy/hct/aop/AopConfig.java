package com.jeestudy.hct.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.jeestudy.hct.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}

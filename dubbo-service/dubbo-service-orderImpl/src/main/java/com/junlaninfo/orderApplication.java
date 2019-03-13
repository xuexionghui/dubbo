package com.junlaninfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/** 

* @author 作者 xuexionghui: 
   @emil:41366915@qq.com
* @version 创建时间：2019年3月13日 下午2:53:26 

* 类说明 

*/ 
@EnableDubbo
@SpringBootApplication
public class orderApplication {

	public static void main(String[] args) {
		SpringApplication.run(orderApplication.class, args);

	}

}
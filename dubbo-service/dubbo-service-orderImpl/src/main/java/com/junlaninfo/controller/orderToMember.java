package com.junlaninfo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.junlaninfo.api.memberInteface;

/** 

* @author 作者 xuexionghui: 
   @emil:41366915@qq.com
* @version 创建时间：2019年3月13日 下午2:54:30 

* 类说明 

*/ 
@RestController
public class orderToMember {
	
	@Reference    //这里要使用dubbo的两个注解之一，引入这个接口，
	//不能使用autowired，不然会出现引用不到的情况
	private   memberInteface memberIm;
	
	@RequestMapping(value="/getUser")
	public String ordertoMember() {
		String string = memberIm.getUser();
		return string;
	}

}

package com.junlaninfo.service;

import org.springframework.beans.factory.annotation.Value;

import com.alibaba.dubbo.config.annotation.Service;
import com.junlaninfo.api.memberInteface;

/** 

* @author 作者 xuexionghui: 
   @emil:41366915@qq.com
* @version 创建时间：2019年3月13日 下午12:18:46 

* 类说明 

*/ 
@Service   //使用dubbo的两个注解之一，将服务注册到注册中心
public class memberImpl implements memberInteface {
	@Value("${dubbo.protocol.port}")
	private  String  dubboPort;
     
	@Override
	public String getUser() {
		
		return "订单服务调用会员服务。。。。dubbo的端口号： "+dubboPort;
	}

}


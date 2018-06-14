package com.ut.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouquanguo
 * @since on 2018/6/13.
 */
@RestController
public class HelloController {



	@RequestMapping("/hello")
	public String index(){


		return "hello world -----> 8090";

	}
}


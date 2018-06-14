package com.youte.controller;

import com.youte.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouquanguo
 * @since 2018/6/14.
 */
@RestController
public class ConsumerController {

	@Autowired
	HelloService helloService;

	@RequestMapping("/")
	public String helloConsumer() {

		return helloService.hello();
	}

	@RequestMapping(value = "/hello")
	public String helloConsumer2() {

		StringBuilder sb = new StringBuilder();
		sb.append(helloService.hello()).append("\n");
		sb.append(helloService.hello1("DIDI")).append("\n");
		sb.append(helloService.hello2("DIDI", 20)).append("\n");
		sb.append(helloService.hello3(new User("DIID", 30))).append("\n");

		return sb.toString();
	}

}

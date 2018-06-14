package com.ut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.restart.RestartEndpoint;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhouquanguo
 * @since on 2018/6/13.
 */
@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping
	public String helloConsumer(){
		return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
	}
}

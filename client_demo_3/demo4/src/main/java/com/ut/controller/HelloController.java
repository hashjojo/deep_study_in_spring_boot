package com.ut.controller;

import com.ut.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhouquanguo
 * @since on 2018/6/13.
 */
@RestController
public class HelloController {
	@RequestMapping(value = "/hello")
	public String index() {

		return "hello world 8091";
	}

	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	public String hello1(@RequestParam String name) {

		return "Hello" + name;
	}

	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	public User hello2(@RequestHeader String name, @RequestHeader Integer age) {

		return new User(name, age);
	}

	@RequestMapping(value = "/hello3", method = RequestMethod.POST)
	public String hello3(@RequestBody User user) {

		return "Hello" + user.getName() + "Age is " + user.getAge();
	}
}

package com.ut.service;

import com.ut.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhouquanguo
 * @since 2018/6/14.
 */
@RequestMapping("/refactor")
public interface HelloService {

	@RequestMapping(value = "/hello4", method = RequestMethod.GET)
	String hello(@RequestParam("name") String name);

	@RequestMapping(value = "/hello5", method = RequestMethod.GET)
	String hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

	@RequestMapping(value = "/hello5", method = RequestMethod.POST)
	String hello(@RequestBody User user);
}

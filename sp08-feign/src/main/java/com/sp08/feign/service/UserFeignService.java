package com.sp08.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.tedu.sp01.pojo.User;
import cn.tedu.web.util.JsonResult;

@FeignClient(name = "user-service",fallback = UserFeignServiceFB.class)
public interface UserFeignService {
	@PostMapping("{userId}/score")
	JsonResult addScore(@PathVariable Integer userId, @RequestParam Integer score);
	
	@GetMapping("/{userId}")
	JsonResult<User> getUser(@PathVariable Integer userId);

}

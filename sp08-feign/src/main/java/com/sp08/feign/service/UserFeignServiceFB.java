package com.sp08.feign.service;

import org.springframework.stereotype.Service;

import cn.tedu.sp01.pojo.User;
import cn.tedu.web.util.JsonResult;

@Service
public class UserFeignServiceFB implements UserFeignService{

	@Override
	public JsonResult addScore(Integer userId, Integer score) {
		return JsonResult.err("用户增加积分失败");
	}

	@Override
	public JsonResult<User> getUser(Integer userId) {
		return JsonResult.err("用户查询失败");
	}

}

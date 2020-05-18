package com.sp08.feign.service;

import org.springframework.stereotype.Service;

import cn.tedu.sp01.pojo.Order;
import cn.tedu.web.util.JsonResult;

@Service
public class OrderFeignServiceFB implements OrderFeignService{

	@Override
	public JsonResult<Order> getOrder(String orderId) {
		return JsonResult.err("订单查询失败");
	}

	@Override
	public JsonResult addOrder() {
		return JsonResult.err("订单保存失败");
	}

}

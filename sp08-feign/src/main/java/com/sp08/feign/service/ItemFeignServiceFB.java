package com.sp08.feign.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.web.util.JsonResult;

@Service
public class ItemFeignServiceFB implements ItemFeignService{

	@Override
	public JsonResult<List<Item>> getItems(String orderId) {
		return JsonResult.err("商品查询失败");
	}
	@Override
	public JsonResult decreaseNumber(List<Item> items) {
		return JsonResult.err("商品库存减少失败");
	}

}

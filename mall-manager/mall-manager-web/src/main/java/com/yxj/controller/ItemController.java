package com.yxj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yxj.pojo.TbItem;
import com.yxj.service.ItemService;
import com.yxj.service.ItemServiceImpl;

@Controller
public class ItemController {
	
	@Autowired
	@Qualifier("itemServiceImpl")
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId){
		
		TbItem item = itemService.getItemById(itemId);
//		TbItem item = new TbItem();
//		item.setBarcode("asdada");
//		item.setNum(63);
		return item;
		
	}

}

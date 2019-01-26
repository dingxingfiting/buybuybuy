package com.igeek.egobuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.igeek.egobuy.pojo.TbItem;
import com.igeek.egobuy.service.ItemService;

/**  
* @ClassName: ItemController  
* @Description: 商品的controller
* @date 2017年11月13日 下午2:25:31    
* Company www.igeekhome.com
*    
*/
@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getById(@PathVariable long itemId){
		//调用service查询
		TbItem item = itemService.getById(itemId);
		return item;
	}
}

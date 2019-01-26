package com.igeek.egobuy.service;

import com.igeek.egobuy.pojo.TbItem;


public interface ItemService {
	/**
	 * 
	* @Title: getById  
	* @Description: 根据商品的ID查询商品信息
	* @param itemId
	* @return
	 */
	public TbItem getById(long itemId);
} 

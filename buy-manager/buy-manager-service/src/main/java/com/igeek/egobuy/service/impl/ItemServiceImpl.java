package com.igeek.egobuy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igeek.egobuy.mapper.TbItemMapper;
import com.igeek.egobuy.pojo.TbItem;
import com.igeek.egobuy.pojo.TbItemExample;
import com.igeek.egobuy.pojo.TbItemExample.Criteria;
import com.igeek.egobuy.service.ItemService;


@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;

	/**
	 * @Title: getById
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param itemId
	 * @return
	 * @see ItemService#getById(long)
	 */
	@Override
	public TbItem getById(long itemId) {
		TbItem item = null;
		// 直接通过ID查询
		item = itemMapper.selectByPrimaryKey(itemId);
//		TbItemExample example = new TbItemExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andIdEqualTo(itemId);
//		List<TbItem> items = itemMapper.selectByExample(example);
//		if (items.size() > 0)
//			item = items.get(0);
		return item;
	}

}

package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.entity.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page, int rows);
}
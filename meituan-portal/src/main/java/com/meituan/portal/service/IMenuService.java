package com.meituan.portal.service;

import com.meituan.common.Utils.MeituanResult;

public interface IMenuService {
	MeituanResult getMenuType(long id);
	MeituanResult getMenu(long id);
}

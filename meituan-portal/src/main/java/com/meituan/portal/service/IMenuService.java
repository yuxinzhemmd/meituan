package com.meituan.portal.service;

import com.meituan.common.Utils.MeituanResult;

public interface IMenuService {
	MeituanResult getMenuType(long sid);
	MeituanResult getMenu(long sid,long cid);
}

package com.meituan.portal.service;

import com.meituan.common.Utils.MeituanResult;
import com.meituan.pojo.Seller;

public interface ISellerService {
	MeituanResult CreateSeller(Seller seller);
	MeituanResult ShowSeller();
	MeituanResult ShowSeller(String type);
}

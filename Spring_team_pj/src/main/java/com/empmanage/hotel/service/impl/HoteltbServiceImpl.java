package com.empmanage.hotel.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empmanage.hotel.service.HoteltbService;
import com.empmanage.hotel.service.dao.HoteltbDAO;
import com.empmanage.hotel.vo.HoteltbVO;
import com.empmanage.hotel.vo.HtloginVO;

@Service("hoteltbService")
public class HoteltbServiceImpl implements HoteltbService{

	@Autowired
	private HoteltbDAO hotelkaja2;



	@Override
	public void detailCheck(HoteltbVO hoteltbVO) {
		// TODO Auto-generated method stub
		hotelkaja2.detailCheck(hoteltbVO);
		
	}


	@Override
	public ArrayList<HoteltbVO> viewHotelList(HoteltbVO hoteltbVO) {
		return hotelkaja2.viewHotelList(hoteltbVO);
	}

	@Override
	public HoteltbVO getPriceInfo(HoteltbVO hoteltbVO) {
		
		return hotelkaja2.getPriceInfo(hoteltbVO);
	}



	@Override
	public void deleteSession(HoteltbVO hoteltbVO) {
		hotelkaja2.deleteSession(hoteltbVO);
	}
}
	


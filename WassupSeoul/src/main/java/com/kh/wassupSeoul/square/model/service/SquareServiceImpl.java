package com.kh.wassupSeoul.square.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.wassupSeoul.common.vo.PageInfo;
import com.kh.wassupSeoul.square.model.dao.SquareDAO;
import com.kh.wassupSeoul.street.model.vo.Street;

@Service
public class SquareServiceImpl implements SquareService{
	
	@Autowired
	private SquareDAO squareDAO;
	
	/** 골목 조회용 Service
	 * @return listCount
	 * @throws Exception
	 */
	@Override
	public int getListCount() throws Exception {
		return squareDAO.getListCount();
	}
	
	
	/** 전체 골목 조회용 Service
	 * @return list
	 * @throws Exception
	 */
	@Override
	public List<Street> selectList(PageInfo pInf) throws Exception{
		return squareDAO.selectList(pInf);
	}
}

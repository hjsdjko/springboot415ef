package com.dao;

import com.entity.CeshibaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CeshibaogaoVO;
import com.entity.view.CeshibaogaoView;


/**
 * 测试报告
 * 
 * @author 
 * @email 
 * @date 2022-03-11 14:04:32
 */
public interface CeshibaogaoDao extends BaseMapper<CeshibaogaoEntity> {
	
	List<CeshibaogaoVO> selectListVO(@Param("ew") Wrapper<CeshibaogaoEntity> wrapper);
	
	CeshibaogaoVO selectVO(@Param("ew") Wrapper<CeshibaogaoEntity> wrapper);
	
	List<CeshibaogaoView> selectListView(@Param("ew") Wrapper<CeshibaogaoEntity> wrapper);

	List<CeshibaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<CeshibaogaoEntity> wrapper);
	
	CeshibaogaoView selectView(@Param("ew") Wrapper<CeshibaogaoEntity> wrapper);
	

}

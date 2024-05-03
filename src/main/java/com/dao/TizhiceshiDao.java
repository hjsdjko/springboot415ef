package com.dao;

import com.entity.TizhiceshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TizhiceshiVO;
import com.entity.view.TizhiceshiView;


/**
 * 体质测试
 * 
 * @author 
 * @email 
 * @date 2022-03-11 14:04:32
 */
public interface TizhiceshiDao extends BaseMapper<TizhiceshiEntity> {
	
	List<TizhiceshiVO> selectListVO(@Param("ew") Wrapper<TizhiceshiEntity> wrapper);
	
	TizhiceshiVO selectVO(@Param("ew") Wrapper<TizhiceshiEntity> wrapper);
	
	List<TizhiceshiView> selectListView(@Param("ew") Wrapper<TizhiceshiEntity> wrapper);

	List<TizhiceshiView> selectListView(Pagination page,@Param("ew") Wrapper<TizhiceshiEntity> wrapper);
	
	TizhiceshiView selectView(@Param("ew") Wrapper<TizhiceshiEntity> wrapper);
	

}

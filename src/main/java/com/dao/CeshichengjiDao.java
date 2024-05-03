package com.dao;

import com.entity.CeshichengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CeshichengjiVO;
import com.entity.view.CeshichengjiView;


/**
 * 测试成绩
 * 
 * @author 
 * @email 
 * @date 2022-03-11 14:04:32
 */
public interface CeshichengjiDao extends BaseMapper<CeshichengjiEntity> {
	
	List<CeshichengjiVO> selectListVO(@Param("ew") Wrapper<CeshichengjiEntity> wrapper);
	
	CeshichengjiVO selectVO(@Param("ew") Wrapper<CeshichengjiEntity> wrapper);
	
	List<CeshichengjiView> selectListView(@Param("ew") Wrapper<CeshichengjiEntity> wrapper);

	List<CeshichengjiView> selectListView(Pagination page,@Param("ew") Wrapper<CeshichengjiEntity> wrapper);
	
	CeshichengjiView selectView(@Param("ew") Wrapper<CeshichengjiEntity> wrapper);
	

}

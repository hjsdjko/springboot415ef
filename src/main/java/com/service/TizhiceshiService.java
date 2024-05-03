package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TizhiceshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TizhiceshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TizhiceshiView;


/**
 * 体质测试
 *
 * @author 
 * @email 
 * @date 2022-03-11 14:04:32
 */
public interface TizhiceshiService extends IService<TizhiceshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TizhiceshiVO> selectListVO(Wrapper<TizhiceshiEntity> wrapper);
   	
   	TizhiceshiVO selectVO(@Param("ew") Wrapper<TizhiceshiEntity> wrapper);
   	
   	List<TizhiceshiView> selectListView(Wrapper<TizhiceshiEntity> wrapper);
   	
   	TizhiceshiView selectView(@Param("ew") Wrapper<TizhiceshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TizhiceshiEntity> wrapper);
   	

}


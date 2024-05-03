package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CeshibaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CeshibaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CeshibaogaoView;


/**
 * 测试报告
 *
 * @author 
 * @email 
 * @date 2022-03-11 14:04:32
 */
public interface CeshibaogaoService extends IService<CeshibaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CeshibaogaoVO> selectListVO(Wrapper<CeshibaogaoEntity> wrapper);
   	
   	CeshibaogaoVO selectVO(@Param("ew") Wrapper<CeshibaogaoEntity> wrapper);
   	
   	List<CeshibaogaoView> selectListView(Wrapper<CeshibaogaoEntity> wrapper);
   	
   	CeshibaogaoView selectView(@Param("ew") Wrapper<CeshibaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CeshibaogaoEntity> wrapper);
   	

}


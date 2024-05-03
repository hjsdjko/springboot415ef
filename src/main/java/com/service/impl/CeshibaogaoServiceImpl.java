package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CeshibaogaoDao;
import com.entity.CeshibaogaoEntity;
import com.service.CeshibaogaoService;
import com.entity.vo.CeshibaogaoVO;
import com.entity.view.CeshibaogaoView;

@Service("ceshibaogaoService")
public class CeshibaogaoServiceImpl extends ServiceImpl<CeshibaogaoDao, CeshibaogaoEntity> implements CeshibaogaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CeshibaogaoEntity> page = this.selectPage(
                new Query<CeshibaogaoEntity>(params).getPage(),
                new EntityWrapper<CeshibaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CeshibaogaoEntity> wrapper) {
		  Page<CeshibaogaoView> page =new Query<CeshibaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CeshibaogaoVO> selectListVO(Wrapper<CeshibaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CeshibaogaoVO selectVO(Wrapper<CeshibaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CeshibaogaoView> selectListView(Wrapper<CeshibaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CeshibaogaoView selectView(Wrapper<CeshibaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

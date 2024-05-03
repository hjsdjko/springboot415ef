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


import com.dao.TizhiceshiDao;
import com.entity.TizhiceshiEntity;
import com.service.TizhiceshiService;
import com.entity.vo.TizhiceshiVO;
import com.entity.view.TizhiceshiView;

@Service("tizhiceshiService")
public class TizhiceshiServiceImpl extends ServiceImpl<TizhiceshiDao, TizhiceshiEntity> implements TizhiceshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TizhiceshiEntity> page = this.selectPage(
                new Query<TizhiceshiEntity>(params).getPage(),
                new EntityWrapper<TizhiceshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TizhiceshiEntity> wrapper) {
		  Page<TizhiceshiView> page =new Query<TizhiceshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TizhiceshiVO> selectListVO(Wrapper<TizhiceshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TizhiceshiVO selectVO(Wrapper<TizhiceshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TizhiceshiView> selectListView(Wrapper<TizhiceshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TizhiceshiView selectView(Wrapper<TizhiceshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

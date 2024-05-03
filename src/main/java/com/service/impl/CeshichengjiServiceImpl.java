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


import com.dao.CeshichengjiDao;
import com.entity.CeshichengjiEntity;
import com.service.CeshichengjiService;
import com.entity.vo.CeshichengjiVO;
import com.entity.view.CeshichengjiView;

@Service("ceshichengjiService")
public class CeshichengjiServiceImpl extends ServiceImpl<CeshichengjiDao, CeshichengjiEntity> implements CeshichengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CeshichengjiEntity> page = this.selectPage(
                new Query<CeshichengjiEntity>(params).getPage(),
                new EntityWrapper<CeshichengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CeshichengjiEntity> wrapper) {
		  Page<CeshichengjiView> page =new Query<CeshichengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CeshichengjiVO> selectListVO(Wrapper<CeshichengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CeshichengjiVO selectVO(Wrapper<CeshichengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CeshichengjiView> selectListView(Wrapper<CeshichengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CeshichengjiView selectView(Wrapper<CeshichengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

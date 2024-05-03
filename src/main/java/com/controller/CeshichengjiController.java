package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.CeshichengjiEntity;
import com.entity.view.CeshichengjiView;

import com.service.CeshichengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 测试成绩
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-11 14:04:32
 */
@RestController
@RequestMapping("/ceshichengji")
public class CeshichengjiController {
    @Autowired
    private CeshichengjiService ceshichengjiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CeshichengjiEntity ceshichengji,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			ceshichengji.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			ceshichengji.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<CeshichengjiEntity> ew = new EntityWrapper<CeshichengjiEntity>();
		PageUtils page = ceshichengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ceshichengji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CeshichengjiEntity ceshichengji, 
		HttpServletRequest request){
        EntityWrapper<CeshichengjiEntity> ew = new EntityWrapper<CeshichengjiEntity>();
		PageUtils page = ceshichengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ceshichengji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CeshichengjiEntity ceshichengji){
       	EntityWrapper<CeshichengjiEntity> ew = new EntityWrapper<CeshichengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ceshichengji, "ceshichengji")); 
        return R.ok().put("data", ceshichengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CeshichengjiEntity ceshichengji){
        EntityWrapper< CeshichengjiEntity> ew = new EntityWrapper< CeshichengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ceshichengji, "ceshichengji")); 
		CeshichengjiView ceshichengjiView =  ceshichengjiService.selectView(ew);
		return R.ok("查询测试成绩成功").put("data", ceshichengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CeshichengjiEntity ceshichengji = ceshichengjiService.selectById(id);
        return R.ok().put("data", ceshichengji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CeshichengjiEntity ceshichengji = ceshichengjiService.selectById(id);
        return R.ok().put("data", ceshichengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CeshichengjiEntity ceshichengji, HttpServletRequest request){
    	ceshichengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ceshichengji);
        ceshichengjiService.insert(ceshichengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CeshichengjiEntity ceshichengji, HttpServletRequest request){
    	ceshichengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ceshichengji);
        ceshichengjiService.insert(ceshichengji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CeshichengjiEntity ceshichengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ceshichengji);
        ceshichengjiService.updateById(ceshichengji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ceshichengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<CeshichengjiEntity> wrapper = new EntityWrapper<CeshichengjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshigonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = ceshichengjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}

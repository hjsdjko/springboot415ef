package com.entity.vo;

import com.entity.TizhiceshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 体质测试
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-11 14:04:32
 */
public class TizhiceshiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 测试名称
	 */
	
	private String ceshimingcheng;
		
	/**
	 * 测试文件
	 */
	
	private String ceshiwenjian;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 测试说明
	 */
	
	private String ceshishuoming;
		
	/**
	 * 测试内容
	 */
	
	private String ceshineirong;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：测试名称
	 */
	 
	public void setCeshimingcheng(String ceshimingcheng) {
		this.ceshimingcheng = ceshimingcheng;
	}
	
	/**
	 * 获取：测试名称
	 */
	public String getCeshimingcheng() {
		return ceshimingcheng;
	}
				
	
	/**
	 * 设置：测试文件
	 */
	 
	public void setCeshiwenjian(String ceshiwenjian) {
		this.ceshiwenjian = ceshiwenjian;
	}
	
	/**
	 * 获取：测试文件
	 */
	public String getCeshiwenjian() {
		return ceshiwenjian;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：测试说明
	 */
	 
	public void setCeshishuoming(String ceshishuoming) {
		this.ceshishuoming = ceshishuoming;
	}
	
	/**
	 * 获取：测试说明
	 */
	public String getCeshishuoming() {
		return ceshishuoming;
	}
				
	
	/**
	 * 设置：测试内容
	 */
	 
	public void setCeshineirong(String ceshineirong) {
		this.ceshineirong = ceshineirong;
	}
	
	/**
	 * 获取：测试内容
	 */
	public String getCeshineirong() {
		return ceshineirong;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
			
}

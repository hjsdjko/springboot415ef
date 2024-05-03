package com.entity.model;

import com.entity.CeshichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 测试成绩
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-11 14:04:32
 */
public class CeshichengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 测试名称
	 */
	
	private String ceshimingcheng;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 测试评分
	 */
	
	private Integer ceshipingfen;
		
	/**
	 * 测试评级
	 */
	
	private String ceshipingji;
		
	/**
	 * 评分时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingfenshijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 测试评价
	 */
	
	private String ceshipingjia;
				
	
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
				
	
	/**
	 * 设置：测试评分
	 */
	 
	public void setCeshipingfen(Integer ceshipingfen) {
		this.ceshipingfen = ceshipingfen;
	}
	
	/**
	 * 获取：测试评分
	 */
	public Integer getCeshipingfen() {
		return ceshipingfen;
	}
				
	
	/**
	 * 设置：测试评级
	 */
	 
	public void setCeshipingji(String ceshipingji) {
		this.ceshipingji = ceshipingji;
	}
	
	/**
	 * 获取：测试评级
	 */
	public String getCeshipingji() {
		return ceshipingji;
	}
				
	
	/**
	 * 设置：评分时间
	 */
	 
	public void setPingfenshijian(Date pingfenshijian) {
		this.pingfenshijian = pingfenshijian;
	}
	
	/**
	 * 获取：评分时间
	 */
	public Date getPingfenshijian() {
		return pingfenshijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：测试评价
	 */
	 
	public void setCeshipingjia(String ceshipingjia) {
		this.ceshipingjia = ceshipingjia;
	}
	
	/**
	 * 获取：测试评价
	 */
	public String getCeshipingjia() {
		return ceshipingjia;
	}
			
}

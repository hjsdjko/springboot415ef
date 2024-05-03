package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 测试报告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-11 14:04:32
 */
@TableName("ceshibaogao")
public class CeshibaogaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CeshibaogaoEntity() {
		
	}
	
	public CeshibaogaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 测试编号
	 */
					
	private String ceshibianhao;
	
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
	 * 报告文件
	 */
					
	private String baogaowenjian;
	
	/**
	 * 提交日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tijiaoriqi;
	
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
	 * 备注
	 */
					
	private String beizhu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：测试编号
	 */
	public void setCeshibianhao(String ceshibianhao) {
		this.ceshibianhao = ceshibianhao;
	}
	/**
	 * 获取：测试编号
	 */
	public String getCeshibianhao() {
		return ceshibianhao;
	}
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
	 * 设置：报告文件
	 */
	public void setBaogaowenjian(String baogaowenjian) {
		this.baogaowenjian = baogaowenjian;
	}
	/**
	 * 获取：报告文件
	 */
	public String getBaogaowenjian() {
		return baogaowenjian;
	}
	/**
	 * 设置：提交日期
	 */
	public void setTijiaoriqi(Date tijiaoriqi) {
		this.tijiaoriqi = tijiaoriqi;
	}
	/**
	 * 获取：提交日期
	 */
	public Date getTijiaoriqi() {
		return tijiaoriqi;
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
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}

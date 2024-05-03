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
 * 体质测试
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-11 14:04:32
 */
@TableName("tizhiceshi")
public class TizhiceshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TizhiceshiEntity() {
		
	}
	
	public TizhiceshiEntity(T t) {
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

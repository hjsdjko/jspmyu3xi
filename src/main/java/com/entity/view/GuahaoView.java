package com.entity.view;

import com.entity.GuahaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 挂号
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 14:04:05
 */
@TableName("guahao")
public class GuahaoView  extends GuahaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuahaoView(){
	}
 
 	public GuahaoView(GuahaoEntity guahaoEntity){
 	try {
			BeanUtils.copyProperties(this, guahaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

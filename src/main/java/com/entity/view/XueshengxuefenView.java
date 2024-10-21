package com.entity.view;

import com.entity.XueshengxuefenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生学分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
@TableName("xueshengxuefen")
public class XueshengxuefenView  extends XueshengxuefenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengxuefenView(){
	}
 
 	public XueshengxuefenView(XueshengxuefenEntity xueshengxuefenEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengxuefenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

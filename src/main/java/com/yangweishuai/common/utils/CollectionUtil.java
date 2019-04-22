package com.yangweishuai.common.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;

/**
 *集合工具类CollectionUtil
 * @author 杨伟帅
 *
 */
public class CollectionUtil {
	//方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public static boolean notEmpty(List<Object> str){
	   if(Collections.unmodifiableList(str) != null) {
		   return true;
	   }else {
		   return false;
	   }
	
	}
	@Test
	public void test() {
		ArrayList<Object> list = new ArrayList<>();
		
		boolean empty = notEmpty( list);
		if(empty==true) {
			System.out.println("集合不为空");
		}else {
			System.out.println("集合为空");
		}
		
	}
	
	
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public static boolean notEmptya(HashMap<Object, Object> map){
		if (CollectionUtils.getCardinalityMap((Collection<?>) map) != null) {
			return true;
		}
		return false;
      
	}
	
	@Test
	public void test2() {
		HashMap<Object, Object> map = new HashMap<>();
		map.put(111, "222");
		boolean notEmptya = notEmptya(map);
		if (notEmptya==true) {
			System.out.println("map集合不是空的");
		}else {
			System.out.println("map是空的");
		}
	}
}

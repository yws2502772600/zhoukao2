package com.yangweishuai.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * 字符串工具类StringUtil
 * @author 杨伟帅
 *
 */
public class StringUtil {
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	  public boolean hasLenth(String src) {
		return false;
		   
		  
	  }
		@Test
		public void test() {			  
			   
		}
		
		
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	  public boolean hasText(String src){
		return false;
		    //实现代码
		}
	  
		@Test
		public void test2() {			  
			   
		}
		
		
		
	//	方法3：判断是否为手机号码 (5分)
		public boolean isMobile(String src){
			return false;
		    //实现代码
		}
		
		@Test
		public void test3() {			  
			   
		}
		
		
		
		//方法4：判断是否为邮箱 (5分)
		public static boolean isEmail(String src){
			return false;
		   
		}
		@Test
		public void test4() {			  
			   
		}
		
		
		
		
		//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
		public  static String reverse(String src){
			
			return StringUtils.reverse(src);		   
		}
		
		@Test
		public void test5() {			  
			  String reverse = reverse("abcdefg");
			  System.out.println(reverse);
		}
		

}

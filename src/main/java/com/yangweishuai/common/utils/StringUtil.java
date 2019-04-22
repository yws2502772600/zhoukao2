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
	  public static boolean hasLenth(String src) {
		  if(StringUtils.isWhitespace(src)) {
	    	  return true;
	      }else {
	    	 return false;
	      }	  
	  }
		@Test
		public void test() {			  
			boolean hasLenth = hasLenth("");
			if(hasLenth==true) {
				System.out.println("输入的为空值");
			}else {
				System.out.println("输入有值");
			}
		}
		
		
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	  public boolean hasText(String src){
		  if(StringUtils.isAlphanumeric(src)) {
	    	  return true;
	      }else {
	    	 return false;
	      }	  
	}
	  
		@Test
		public void test2() {			  
			boolean hasLenth = hasLenth("ab  c");
			if(hasLenth==true) {
				System.out.println("输入的为空值");
			}else {
				System.out.println("输入有值");
			}
		}
		
		
		
	//	方法3：判断是否为手机号码 (5分)
		public static boolean isMobile(String src){
			 String str="/[1-9],{/d,11}";
			   if(str.equals(src)) {
					return true;
			   }else {
				 return false;
			   }
		
		}
		
		@Test
		public void test3() {			  
			  boolean mobile = isMobile("15100425849");
			  if(mobile==true) {
				  System.out.println("是手机号");
			  }else {
				  System.out.println("不是手机号");
			  }
		}
		
		
		
		//方法4：判断是否为邮箱 (5分)
		public static boolean isEmail(String src){
			 String str="/[1-9],{/d@,11}";
			   if(str.equals(src)) {
					return true;
			   }else {
				 return false;
			   }
		   
		}
		@Test
		public void test4() {			  
			  boolean email = isEmail("2502772600@qq.com");
			  if(email==true) {
				  System.out.println("是邮箱");
			  }else {
				  System.out.println("不是邮箱");
			  }
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

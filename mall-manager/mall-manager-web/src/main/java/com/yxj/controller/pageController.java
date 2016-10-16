package com.yxj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 * @author Administrator
 *
 */

@Controller
public class pageController {
	
	/**
	 * 打开首页
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	
	/**
	 * 展示其他页面
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}

}

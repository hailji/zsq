package com.zsq.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系統application控制器 
 * @author zhuyy
 */
@Controller
@RequestMapping("/test")
public class ApplicationController extends BaseAction {
	
	/**
	 * 系统根页面
	 */
	@RequestMapping
	public String systemIndex(){
		return "/index";
	}
	
}

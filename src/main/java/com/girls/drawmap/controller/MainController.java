package com.girls.drawmap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("")
	public String index() {
		return "main/index";
	}

	// yeo:블로그 연결
	@RequestMapping("/blog")
	public String blog() {
		return "blog/blog";
	}

}

package com.sgnbs.wechat.adminJsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminJspAction {
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminIndex(Model model) {
		//return "wechat/admin/login";
		return "wechat/admin/dashboard";
	}

	@RequestMapping(value = "/admin/login", method = RequestMethod.GET)
	public String loginPage(Model model) {
		return "wechat/admin/login";
	}
}

package com.crazypig.ssm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crazypig.ssm.domain.Account;
import com.crazypig.ssm.service.AccountService;

@RequestMapping("/account")
@Controller
public class AccountController extends BaseController<Account, AccountService> {
	
}

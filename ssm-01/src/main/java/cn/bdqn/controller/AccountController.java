package cn.bdqn.controller;

import cn.bdqn.domain.Account;
import cn.bdqn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account/")
public class AccountController {

	// xxx
    @Autowired
    private AccountService accountService;

	//adfjklfjdkl
	//adfjkldfjl
	//dfajklfjdklfkjd
    @RequestMapping(value = "queryAll")
    public String queryAll(Model model){
        List<Account> accounts = accountService.queryAll();
        model.addAttribute("accounts",accounts);
        return "queryAll";
    }


	// xxxx
	// yyyy
	// zzz
    @RequestMapping(value = "register")
    public String register(Account account){
        accountService.save(account);

        return "success";
    }



}

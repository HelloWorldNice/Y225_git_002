package cn.bdqn.mapper;

import cn.bdqn.domain.Account;

import java.util.List;

public interface AccountMapper {

    // 查询全部账号
    public List<Account> selectAll();

    // 添加账号
    public void insert(Account account);
}

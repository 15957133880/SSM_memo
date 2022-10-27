package com.hdu.service.impl;

import com.hdu.domain.Account;
import com.hdu.dao.AccountDao;
import com.hdu.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 黑马程序员
 * @since 2022-10-27
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountDao, Account> implements IAccountService {

}

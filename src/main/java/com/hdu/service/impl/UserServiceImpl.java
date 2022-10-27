package com.hdu.service.impl;

import com.hdu.domain.User;
import com.hdu.dao.UserDao;
import com.hdu.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}

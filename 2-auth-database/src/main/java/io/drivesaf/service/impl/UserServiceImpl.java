package io.drivesaf.service.impl;

import io.drivesaf.entity.User;
import io.drivesaf.mapper.UserMapper;
import io.drivesaf.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author drivesaf
 * @since 2024-11-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

package com.jingtengyu.blogblogmodule.common.domain.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jingtengyu.blogblogmodule.common.domain.dos.UserDO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author: 犬小哈
 * @url: www.quanxiaoha.com
 * @date: 2023-08-22 17:06
 * @description: TODO
 **/
@Component
public interface UserMapper extends BaseMapper<UserDO> {
}

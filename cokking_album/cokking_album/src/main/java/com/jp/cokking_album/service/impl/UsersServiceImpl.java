package com.jp.cokking_album.service.impl;

import org.springframework.stereotype.Service;

import com.jp.cokking_album.dto.Users;
import com.jp.cokking_album.repository.UsersMapper;
import com.jp.cokking_album.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

    private UsersMapper mapper;

    public UsersServiceImpl(UsersMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Users register(Users users) {
        // TODO 自動生成されたメソッド・スタブ
        mapper.insert(users);
        return users;
    }

}

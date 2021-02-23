package com.jp.cokking_album.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.cokking_album.dto.Users;
import com.jp.cokking_album.repository.UsersMapper;
import com.jp.cokking_album.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper mapper;

    public UsersServiceImpl(UsersMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Users register(Users users) {

        mapper.insert(users);
        return users;
    }

    @Override
    public Users findById(int user_id) {
        return mapper.findById(user_id);
    }

    @Override
    public Users findByName(String name) {
        return mapper.findByName(name);
    }

}

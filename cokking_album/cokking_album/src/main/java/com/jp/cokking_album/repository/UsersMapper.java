package com.jp.cokking_album.repository;

import org.apache.ibatis.annotations.Mapper;

import com.jp.cokking_album.dto.Users;

@Mapper
public interface UsersMapper {

    int insert(Users users);

}

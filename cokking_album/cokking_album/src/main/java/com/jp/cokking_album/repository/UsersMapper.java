package com.jp.cokking_album.repository;

import org.apache.ibatis.annotations.Mapper;

import com.jp.cokking_album.dto.Users;

@Mapper
public interface UsersMapper {

    /**
     * Usersテーブルへのinsert
     * @param users
     * @return
     */
    int insert(Users users);

    /**
     * user_idでのselect
     * @param user_id
     * @return
     */
    Users findById(int user_id);

}

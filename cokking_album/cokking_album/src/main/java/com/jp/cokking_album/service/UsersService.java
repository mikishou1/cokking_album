package com.jp.cokking_album.service;

import com.jp.cokking_album.dto.Users;

public interface UsersService {

    /**
     * ユーザ登録
     * @param users
     * @return
     */
    Users register(Users users);

    /**
     * ユーザ検索（By id）
     * @param user_id
     * @return
     */
    Users findById(int user_id);

}

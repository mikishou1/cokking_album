package com.jp.cokking_album.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Users {

    private int user_id;

    @NotNull
    private String name;

    @NotNull
    private String password;

    @NotNull
    private int role;


}

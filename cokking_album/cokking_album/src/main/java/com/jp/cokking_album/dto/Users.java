package com.jp.cokking_album.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Users {

    @NotNull
    private int user_id;

    @NotNull
    private String name;

    @NotNull
    private int role;


}

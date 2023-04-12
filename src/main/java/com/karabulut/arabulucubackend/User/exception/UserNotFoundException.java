package com.karabulut.arabulucubackend.User.exception;


import com.karabulut.arabulucubackend.Common.exception.BaseException;
import com.karabulut.arabulucubackend.User.enums.UserResponseCode;

public class UserNotFoundException extends BaseException {
    public UserNotFoundException() {
        super(UserResponseCode.USER_NOT_FOUND);
    }
}

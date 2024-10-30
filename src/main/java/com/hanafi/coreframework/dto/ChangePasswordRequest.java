package com.hanafi.coreframework.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ChangePasswordRequest {

    private final String oldPassword;
    private final String newPassword;
}
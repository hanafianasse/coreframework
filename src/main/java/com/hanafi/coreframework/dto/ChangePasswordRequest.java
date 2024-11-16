package com.hanafi.coreframework.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class ChangePasswordRequest {
    private String oldPassword;
    private String newPassword;
}
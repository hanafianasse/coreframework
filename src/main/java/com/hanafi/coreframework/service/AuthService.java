package com.hanafi.coreframework.service;

import com.hanafi.coreframework.dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}

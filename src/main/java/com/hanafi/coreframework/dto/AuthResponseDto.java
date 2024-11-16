package com.hanafi.coreframework.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AuthResponseDto {

    private String accessToken;

}

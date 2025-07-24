package com.gurunath.security;

import org.springframework.stereotype.Component;


@Component
public class AppSecurityEndPoints {

    public static String[] PUBLIC_END_POINTS={
            "api/user/register",
            "/api/user/login"
    };


}

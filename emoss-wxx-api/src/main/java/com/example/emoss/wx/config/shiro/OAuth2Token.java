package com.example.emoss.wx.config.shiro;




//把令牌封装成认证对象
import org.apache.shiro.authc.AuthenticationToken;

public class OAuth2Token implements AuthenticationToken {
    private String token;

    public OAuth2Token(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}

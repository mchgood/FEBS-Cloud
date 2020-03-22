package com.tangkc.febs.auth.properties;

import lombok.Data;

/**
 * @Auther: tangkc
 * @Date: 2020/3/22
 * @Description: Client配置
 */
@Data
public class FebsClientsProperties {
    private String client;
    private String secret;
    private String grantType = "password,authorization_code,refresh_token";
    private String scope = "all";
}

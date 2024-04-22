package com.hb.hbapiclientsdk;

import com.hb.hbapiclientsdk.client.HbApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//配置类
@Configuration
//配置前缀
@ConfigurationProperties("hbapi.client")
//自动生成getter setter
@Data
//自动扫描组件
@ComponentScan
public class HbApiClientConfig {
    private String accessKey;

    private String secretKey;

    @Bean
    public HbApiClient hbApiClient(){

        return new HbApiClient(accessKey,secretKey);
    }


}

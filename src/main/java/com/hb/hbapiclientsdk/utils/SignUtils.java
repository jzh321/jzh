package com.hb.hbapiclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

public class SignUtils {
    /**
     * 签名算法
     */

    public static String genSign(String body, String secretKey){
        //使用SHA256算法的Digester
        Digester md5=new Digester(DigestAlgorithm.SHA256);
        //构建签名内容，将哈希映射转换为字符串并拼接成密钥
        String content =body+"."+secretKey;
        //计算签名的摘要并返回十六进制格式
        return md5.digestHex(content);


    }
}

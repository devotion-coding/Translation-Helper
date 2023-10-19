package com.devotion_coding.translation_helper_starter.config;

import com.devotion_coding.translation_helper_starter.enums.LanguageType;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * 翻译助手参数配置
 *
 * @author tj
 * @date 2023/10/18
 */
@Data
@Configuration(proxyBeanMethods = false)
@ConfigurationProperties(prefix = "translation.helper")
public class TranslationHelperProperties {

    /**
     * 默认的翻译客户端
     */
    private String defaultClient = "tencent";

    /**
     *
     */
    private String tencentClientProjectId;

    /**
     * 默认的 原文语种
     */
    private String defaultSourceLanguageType = LanguageType.US.name();

    /**
     * 默认的 目标语种
     */
    private String defaultTargetLanguageType = LanguageType.ZH.name();

}

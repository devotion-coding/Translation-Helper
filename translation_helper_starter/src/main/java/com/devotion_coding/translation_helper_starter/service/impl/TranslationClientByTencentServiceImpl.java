package com.devotion_coding.translation_helper_starter.service.impl;

import com.devotion_coding.translation_helper_starter.config.TranslationHelperProperties;
import com.devotion_coding.translation_helper_starter.enums.LanguageType;
import com.devotion_coding.translation_helper_starter.service.TranslationClientService;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 腾讯翻译
 *
 * @author tj
 * @date 2023/10/18
 */
@Service
public class TranslationClientByTencentServiceImpl extends AbstractClient implements TranslationClientService{

    @Resource
    private TranslationHelperProperties properties;

    /**
     *
     */
    private static String endpoint = "tmt.tencentcloudapi.com";
    /**
     *
     */
    private static String service = "tmt";
    /**
     *
     */
    private static String version = "2018-03-21";

    public TranslationClientByTencentServiceImpl(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TranslationClientByTencentServiceImpl(Credential credential, String region, ClientProfile profile) {
        super(TranslationClientByTencentServiceImpl.endpoint, TranslationClientByTencentServiceImpl.version, credential, region, profile);
    }


    @Override
    public String getClientName() {
        return "tencent";
    }

    @Override
    public String translat(String text) {
        return translat(text, LanguageType.valueOf(properties.getDefaultSourceLanguageType()), LanguageType.valueOf(properties.getDefaultTargetLanguageType()));
    }

    @Override
    public String translat(String text, LanguageType sourceLangType, LanguageType targetLangType) {
        return getClientName() + "翻译后：" + text;
    }
}

package com.devotion_coding.translation_helper_starter.service.impl;

import com.devotion_coding.translation_helper_starter.config.TranslationHelperProperties;
import com.devotion_coding.translation_helper_starter.enums.LanguageType;
import com.devotion_coding.translation_helper_starter.service.TranslationClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 腾讯翻译
 *
 * @author tj
 * @date 2023/10/18
 */
@Service
public class TranslationClientByALitServiceImpl implements TranslationClientService {

    @Resource
    private TranslationHelperProperties properties;

    @Override
    public String getClientName() {
        return "ali";
    }

    @Override
    public String translat(String text) {
        return translat(text, LanguageType.valueOf(properties.getDefaultSourceLanguageType()), LanguageType.valueOf(properties.getDefaultTargetLanguageType()));
    }

    @Override
    public String translat(String text, LanguageType sourceLangType, LanguageType targetLangType) {
        return getClientName()+"翻译后：" + text;
    }
}

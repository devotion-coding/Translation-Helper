package com.devotion_coding.translation_helper_starter.service;

import com.devotion_coding.translation_helper_starter.enums.LanguageType;

/**
 * 翻译客户端服务
 *
 * @author tj
 * @date 2023/10/18
 */
public interface TranslationClientService {

    /**
     * 获取客户端名称
     *
     * @return {@link String}
     */
    String getClientName();

    /**
     * 翻译
     *
     * @param text 文本
     * @return {@link String}
     */
    String translat(String text);

    /**
     * 翻译
     *
     * @param text           文本
     * @param sourceLangType 源语种
     * @param targetLangType 目标语种
     * @return {@link String}
     */
    String translat(String text, LanguageType sourceLangType, LanguageType targetLangType);
}

package com.devotion_coding.translation_helper_starter.helper;

import com.devotion_coding.translation_helper_starter.config.TranslationHelperProperties;
import com.devotion_coding.translation_helper_starter.exception.NoSuchTranslationClientException;
import com.devotion_coding.translation_helper_starter.service.TranslationClientService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 翻译助手
 *
 * @author tj
 * @date 2023/10/18
 */
@Component
public class TranslationHelper {

    @Resource
    private TranslationHelperProperties properties;

    @Resource
    private List<TranslationClientService> clientServiceList;

    /**
     * 获取客户端
     *
     * @return {@link TranslationClientService}
     */
    public TranslationClientService getClient() {
        return clientServiceList.stream()
                .filter(item -> item.getClientName().equals(properties.getDefaultClient()))
                .findFirst()
                .orElseThrow(() -> new NoSuchTranslationClientException(properties.getDefaultClient()));
    }

    /**
     * 获取客户端
     *
     * @param clientName 客户端名称
     * @return {@link TranslationClientService}
     */
    public TranslationClientService getClient(String clientName) {
        return clientServiceList.stream()
                .filter(item -> item.getClientName().equals(clientName))
                .findFirst()
                .orElseThrow(() -> new NoSuchTranslationClientException(properties.getDefaultClient()));
    }
}

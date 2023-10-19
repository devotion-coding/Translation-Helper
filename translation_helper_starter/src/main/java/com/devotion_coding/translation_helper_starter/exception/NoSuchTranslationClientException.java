package com.devotion_coding.translation_helper_starter.exception;

/**
 * 没有指定的翻译客户端 异常
 * @author tj
 * @date 2023/10/18
 */
public class NoSuchTranslationClientException extends RuntimeException {

    public NoSuchTranslationClientException(String message) {
        super(message);
    }
}

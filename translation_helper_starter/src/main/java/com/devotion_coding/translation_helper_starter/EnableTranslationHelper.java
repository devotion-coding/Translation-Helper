package com.devotion_coding.translation_helper_starter;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 启用翻译助手插件
 *
 * @author tj
 * @date 2023/10/18
 */
@Documented
@Target({TYPE})
@Retention(RUNTIME)
@Configuration(proxyBeanMethods = false)
@Import(value = TranslationHelperStarterConfiguration.class)
public @interface EnableTranslationHelper {
}

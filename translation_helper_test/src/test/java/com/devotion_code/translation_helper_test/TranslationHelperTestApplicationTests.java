package com.devotion_code.translation_helper_test;

import com.devotion_coding.translation_helper_starter.EnableTranslationHelper;
import com.devotion_coding.translation_helper_starter.helper.TranslationHelper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@EnableTranslationHelper
@SpringBootTest
class TranslationHelperTestApplicationTests {

    @Resource
    private TranslationHelper translationHelper;

    @Test
    void contextLoads() {
        System.out.println(translationHelper.getClient().translat("你好"));
    }

}

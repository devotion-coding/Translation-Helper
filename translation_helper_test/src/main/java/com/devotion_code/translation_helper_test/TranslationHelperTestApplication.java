package com.devotion_code.translation_helper_test;

import com.devotion_coding.translation_helper_starter.EnableTranslationHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTranslationHelper
public class TranslationHelperTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TranslationHelperTestApplication.class, args);
    }

}

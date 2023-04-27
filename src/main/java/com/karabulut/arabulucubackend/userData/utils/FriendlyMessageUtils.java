package com.karabulut.arabulucubackend.userData.utils;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import com.karabulut.arabulucubackend.common.dto.Code;
import com.karabulut.arabulucubackend.userData.enums.Language;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@UtilityClass
public class FriendlyMessageUtils {

    private static final String RESOURCE_BUNDLE_NAME = "FriendlyMessage";

    public static String getFriendlyMessage(Language language, Code messageCode) {
        try {
            Locale locale = new Locale(language.name());
            ResourceBundle resourceBundle = ResourceBundle.getBundle(RESOURCE_BUNDLE_NAME, locale);
            return resourceBundle.getString(messageCode.toString());
        } catch (MissingResourceException missingResourceException) {
            log.error("Friendly message not found for key: {}", messageCode.toString());
            return null;
        }
    }
}

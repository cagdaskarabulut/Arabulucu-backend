package com.karabulut.arabulucubackend.utils.common;

import com.karabulut.arabulucubackend.dto.common.MessageCore;
import com.karabulut.arabulucubackend.enums.common.Language;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

@Slf4j
@UtilityClass
public class FriendlyMessageUtils {

    private static final String RESOURCE_BUNDLE_NAME = "messages";

    public static String getFriendlyMessage(Language language, MessageCore messageCore) {
        try {
            Locale locale = new Locale(language.name());
            ResourceBundle resourceBundle = ResourceBundle.getBundle(RESOURCE_BUNDLE_NAME, locale);
            return resourceBundle.getString(messageCore.toString());
        } catch (MissingResourceException missingResourceException) {
            log.error("Friendly message not found for key: {}", messageCore.toString());
            return null;
        }
    }
}
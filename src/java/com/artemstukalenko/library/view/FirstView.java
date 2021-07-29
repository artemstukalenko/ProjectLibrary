package com.artemstukalenko.library.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class FirstView {

    public static final String RESOURCE_BUNDLE_NAME = "messages";
    public static ResourceBundle bundle = ResourceBundle.getBundle(RESOURCE_BUNDLE_NAME, new Locale("en", "EN"));

    public static String howToLogin;
    public static String loginAsUser;
    public static String loginAsAdmin;
    public static String loggedInAsUser;
    public static String loggedInAsAdmin;

    static {
        howToLogin = bundle.getString(TextConstants.HOW_DO_YOU_WISH_TO_LOGIN);
        loginAsUser = bundle.getString(TextConstants.LOGIN_AS_USER);
        loginAsAdmin = bundle.getString(TextConstants.LOGIN_AS_ADMIN);
        loggedInAsUser = bundle.getString(TextConstants.LOGGED_IN_AS_USER);
        loggedInAsAdmin = bundle.getString(TextConstants.LOGGED_IN_AS_ADMIN);
    }

    public static void initStringFields(ResourceBundle bundle) {
        howToLogin = bundle.getString(TextConstants.HOW_DO_YOU_WISH_TO_LOGIN);
        loginAsUser = bundle.getString(TextConstants.LOGIN_AS_USER);
        loginAsAdmin = bundle.getString(TextConstants.LOGIN_AS_ADMIN);
        loggedInAsUser = bundle.getString(TextConstants.LOGGED_IN_AS_USER);
        loggedInAsAdmin = bundle.getString(TextConstants.LOGGED_IN_AS_ADMIN);
    }

    public FirstView() {}

    public static void changeLanguageToUa() {
        bundle = ResourceBundle.getBundle(RESOURCE_BUNDLE_NAME, new Locale("ua", "UA"));

        initStringFields(bundle);
    }

    public static void changeLanguageToEn() {
        bundle = ResourceBundle.getBundle(RESOURCE_BUNDLE_NAME, new Locale("en", "EN"));

        initStringFields(bundle);
    }

    public String getHowToLogin() {
        return howToLogin;
    }

    public String getLoginAsUser() {
        return loginAsUser;
    }

    public String getLoginAsAdmin() {
        return loginAsAdmin;
    }

    public String getLoggedInAsUser() {
        return loggedInAsUser;
    }

    public String getLoggedInAsAdmin() {
        return loggedInAsAdmin;
    }
}

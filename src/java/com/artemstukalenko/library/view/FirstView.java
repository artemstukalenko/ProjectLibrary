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
    public static String usersListString;
    public static String seeUsersList;
    public static String seeBooksList;
    public static String booksListString;
    public static String toHomePage;
    public static String seeSubscriptionsList;
    public static String subscriptionsListString;

    static {
        howToLogin = bundle.getString(TextConstants.HOW_DO_YOU_WISH_TO_LOGIN);
        loginAsUser = bundle.getString(TextConstants.LOGIN_AS_USER);
        loginAsAdmin = bundle.getString(TextConstants.LOGIN_AS_ADMIN);
        loggedInAsUser = bundle.getString(TextConstants.LOGGED_IN_AS_USER);
        loggedInAsAdmin = bundle.getString(TextConstants.LOGGED_IN_AS_ADMIN);
        usersListString = bundle.getString(TextConstants.USERS_LIST_STRING);
        seeUsersList = bundle.getString(TextConstants.SEE_USERS_LIST);
        seeBooksList = bundle.getString(TextConstants.SEE_BOOK_LIST);
        booksListString = bundle.getString(TextConstants.BOOK_LIST_STRING);
        toHomePage = bundle.getString(TextConstants.TO_HOME_PAGE);
        seeSubscriptionsList = bundle.getString(TextConstants.SEE_SUBSCRIPTIONS_LIST);
        subscriptionsListString = bundle.getString(TextConstants.SUBSCRIPTIONS_LIST_STRING);
    }

    public static void initStringFields(ResourceBundle bundle) {
        howToLogin = bundle.getString(TextConstants.HOW_DO_YOU_WISH_TO_LOGIN);
        loginAsUser = bundle.getString(TextConstants.LOGIN_AS_USER);
        loginAsAdmin = bundle.getString(TextConstants.LOGIN_AS_ADMIN);
        loggedInAsUser = bundle.getString(TextConstants.LOGGED_IN_AS_USER);
        loggedInAsAdmin = bundle.getString(TextConstants.LOGGED_IN_AS_ADMIN);
        usersListString = bundle.getString(TextConstants.USERS_LIST_STRING);
        seeUsersList = bundle.getString(TextConstants.SEE_USERS_LIST);
        seeBooksList = bundle.getString(TextConstants.SEE_BOOK_LIST);
        booksListString = bundle.getString(TextConstants.BOOK_LIST_STRING);
        toHomePage = bundle.getString(TextConstants.TO_HOME_PAGE);
        seeSubscriptionsList = bundle.getString(TextConstants.SEE_SUBSCRIPTIONS_LIST);
        subscriptionsListString = bundle.getString(TextConstants.SUBSCRIPTIONS_LIST_STRING);
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

    public String getUsersListString() {return usersListString;}

    public String getSeeUsersList() {return seeUsersList;}

    public String getSeeBooksList() {return seeBooksList;}

    public String getBooksListString() {return booksListString;}

    public String getToHomePage() {return toHomePage;}

    public String getSeeSubscriptionsList() {return seeSubscriptionsList;}

    public String getSubscriptionsListString() {return subscriptionsListString;}
}

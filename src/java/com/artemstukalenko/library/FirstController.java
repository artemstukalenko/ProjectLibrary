package com.artemstukalenko.library;

import com.artemstukalenko.library.view.FirstView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    FirstView controlledView = new FirstView();

    @RequestMapping("/")
    public String getChangeLanguagePage(Model model) {
        model.addAttribute("locale", controlledView);
        return "homepage";
    }

    @RequestMapping("en")
    public String getPageWithEnLang(Model model) {
        model.addAttribute("locale", controlledView);

        FirstView.changeLanguageToEn();

        return "homepage";
    }

    @RequestMapping("ua")
    public String getPageWithUaLang(Model model) {
        model.addAttribute("locale", controlledView);

        FirstView.changeLanguageToUa();

        return "homepage";
    }

    @RequestMapping("/asUser")
    public String getUserEntryPage(Model model) {
        model.addAttribute("locale", controlledView);

        return "user-entry-page";
    }

    @RequestMapping("/asAdmin")
    public String getAdminEntryPage(Model model) {
        model.addAttribute("locale", controlledView);

        return "admin-entry-page";
    }

}
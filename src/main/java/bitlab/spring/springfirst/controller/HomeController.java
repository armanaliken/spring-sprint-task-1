package bitlab.spring.springfirst.controller;

import bitlab.spring.springfirst.db.dbManager;
import bitlab.spring.springfirst.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(Model model) {
        List<Item> itemList = dbManager.getItemList();
        model.addAttribute("student", itemList);
        return "home";
    }

    @GetMapping("/add")
    public String addPage() {
        return "add";
    }

    @PostMapping("/add")
    public String addItem(Item item) {
        dbManager.createItem(item);
        return "redirect:/";
    }
}

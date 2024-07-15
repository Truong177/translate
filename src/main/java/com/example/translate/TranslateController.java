package com.example.translate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TranslateController {
    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("world", "thế giới");
        dictionary.put("book", "quyển sách");
        dictionary.put("computer", "máy tính");
    }
    @GetMapping("")
    public String showForm(){
        return "index";
    }
    @GetMapping("/lookup")
    public String lookUp( String word, Model model){
        String meaning = dictionary.get(word.toLowerCase());
        if (meaning != null) {
            model.addAttribute("word", word);
            model.addAttribute("meaning", meaning);
        } else {
            model.addAttribute("word", word);
            model.addAttribute("message", "Không tìm thấy từ");
        }
        return "result";
    }
}

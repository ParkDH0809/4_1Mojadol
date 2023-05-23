package capstone.opotato.controller;


import capstone.opotato.entity.Log;
import capstone.opotato.entity.Member;
import capstone.opotato.repository.LogRepository;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class LogController {

    private final LogRepository logRepository;
    //로그 페이지
    @GetMapping("/logview")
    public String logview(Model model, HttpSession session) {
        Member member = (Member) session.getAttribute("loginMember");

        List<Log> log = logRepository.findByCameraid(member.getCameraid());
        model.addAttribute("log", log);
        return "logview";
    }


}

package capstone.opotato.controller;

import capstone.opotato.entity.Member;
import capstone.opotato.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    //Welcome 페이지
    @GetMapping("/")
    public String welcome() {
        return "home";
    }

    //Login Home 페이지
    @GetMapping("/loginHome")
    public String loginHome() {
        return "/loginHome";
    }


    //회원 가입 페이지
    @GetMapping("/signup")
    public String signupForm(@ModelAttribute("member") Member member) {
        return "login/signupForm";
    }


    @PostMapping("/signUp")
    public String save(@ModelAttribute Member member) {
        memberRepository.save(member);
        return "redirect:/";
    }



    //About 페이지
    @GetMapping("/about")
    public String about() {
        return "about";
    }


    @GetMapping("/loginAbout")
    public String loginAbout() {
        return "loginAbout";
    }


}

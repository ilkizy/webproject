package com.ilkiz.webproject.controller.mvccontroller;

import com.ilkiz.webproject.dto.request.UserSaveRequestDto;
import com.ilkiz.webproject.repository.entity.User;
import com.ilkiz.webproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

import static com.ilkiz.webproject.constants.EndPoints.*;

@Controller
@RequestMapping(LOGINPAGE)
@RequiredArgsConstructor
public class LoginMvcController {

    private final UserService userService;

    private final HomeMvcController homeMvcController;
    @GetMapping(LOGIN)
    public ModelAndView login(){
        String username = "Kullanici Adi";
        String password = "Sifre";
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("login");

        modelAndView.addObject("lblusername", username);
        modelAndView.addObject("lblpassword", password);

        return modelAndView;
    }

    @PostMapping(DOLOGIN)
    public ModelAndView doLogin(String txtusername, String txtpassword){

        ModelAndView modelAndView = new ModelAndView();
        Optional<User> user = userService.login(txtusername,txtpassword);
        System.out.println(user.get().getId());
        if (user.isPresent()){
            modelAndView.addObject("userId",user.get().getId());
            modelAndView.setViewName("redirect:/home/home");
            return modelAndView;

        }else {
            System.out.println("Sifre ya da kullanici adi hatali");
        }
        return null;
    }

    @GetMapping("/register")
    public ModelAndView register(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");
        return modelAndView;
    }
    @PostMapping("/doregister")
    public ModelAndView doRegister(UserSaveRequestDto dto){
        userService.saveDto(dto);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:login");
        return modelAndView;
    }
}

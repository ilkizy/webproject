package com.ilkiz.webproject.controller.mvccontroller;

import com.ilkiz.webproject.mvcmodel.HomeModel;
import com.ilkiz.webproject.repository.entity.User;
import com.ilkiz.webproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@Controller
@RequestMapping("/home")
@RequiredArgsConstructor
public class HomeMvcController {

    private final UserService userService;

    @GetMapping("/home")
    public ModelAndView home(Long userId){

        Optional<User> user=userService.findById(userId);
        ModelAndView modelAndView = new ModelAndView();
        HomeModel homeModel = new HomeModel();
       if (user.get().getGender().equals("MAN")){
            homeModel = HomeModel.builder()
                    .picture1("https://www.w3schools.com/howto/img_avatar.png")
                    .picture2("https://www.pngall.com/wp-content/uploads/2018/05/Friends-PNG-File.png")
                    .picture3("https://www.seekpng.com/png/detail/28-282439_football-in-mwanza-people-play-football-png.png")
                    .picture4("https://www.pngall.com/wp-content/uploads/13/Soccer-PNG-Image-HD.png")
                    .picture5("https://www.pngall.com/wp-content/uploads/13/Max-Payne-PNG-Free-Image.png")
                    .picture6("https://www.pngall.com/wp-content/uploads/3/MMA-Fight-PNG.png")
                    .picture7("https://www.pngall.com/wp-content/uploads/13/Casino-Roulette-PNG-File.png")
                    .picture8("https://www.pngall.com/wp-content/uploads/2/Video-Game.png")
                    .picture9("https://www.pngall.com/wp-content/uploads/2018/04/Luxury-Car-PNG-HD.png")
                    .picture10("https://www.pngall.com/wp-content/uploads/12/Gambit-PNG-Pic.png")
                    .picture11("https://www.pngall.com/wp-content/uploads/2018/04/Muscle-PNG-File-Download-Free.png")
                    .picture12("https://www.pngall.com/wp-content/uploads/5/Super-Dad-PNG-Free-Download.png")
                    .username(user.get().getUsername())
                    .build();
        }else {
            homeModel = HomeModel.builder()
                    .picture1("https://www.clipartmax.com/png/small/121-1214390_female-avatar-female-avatar.png")
                    .picture2("https://www.pngall.com/wp-content/uploads/13/Secretary-Woman-PNG-Photos.png")
                    .picture3("https://www.pngall.com/wp-content/uploads/5/Watercolor-Flower-PNG-Picture.png")
                    .picture4("https://clipart.world/wp-content/uploads/2021/05/Best-Friends-clipart-png-free.png")
                    .picture5("https://www.pngkey.com/png/detail/168-1686976_girls-night-out-silhouette.png")
                    .picture6("https://www.pngall.com/wp-content/uploads/2017/03/Baby-PNG-Picture.png")
                    .picture7("https://www.pngall.com/wp-content/uploads/4/Bride-PNG.png")
                    .picture8("https://www.pngall.com/wp-content/uploads/12/Makeup-Tools.png")
                    .picture9("https://www.pngall.com/wp-content/uploads/7/Bakery-PNG.png")
                    .picture10("https://www.pngall.com/wp-content/uploads/2016/04/Beach-PNG-Pic.png")
                    .picture11("https://www.pngall.com/wp-content/uploads/2017/03/Family-Transparent.png")
                    .picture12("https://www.pngall.com/wp-content/uploads/1/I-Love-You-Mom-PNG.png")
                    .username(user.get().getUsername())
                    .build();
        }

        modelAndView.addObject("model",homeModel);
        modelAndView.setViewName("home");
        return modelAndView;
    }
}

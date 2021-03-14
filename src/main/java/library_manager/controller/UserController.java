package library_manager.controller;

import library_manager.model.Offer;
import library_manager.model.User;
import library_manager.service.offer.IOfferService;
import library_manager.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IOfferService offerService;

    @ModelAttribute("offers")
    public List<Offer> getAllOffer() {
        return offerService.findAll();
    }

    @GetMapping("/all")
    public ModelAndView showIndex() {
        List<User> users = userService.findAll();
        return new ModelAndView("user/index", "users", users);
    }

    @GetMapping("/create")
    public ModelAndView showCreatePage() {
        return new ModelAndView("user/create", "user", new User());
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute("user") User user) {
        userService.save(user);
        return new ModelAndView("redirect:/user/all");
    }
}

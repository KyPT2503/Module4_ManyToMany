package library_manager.controller;

import library_manager.model.Offer;
import library_manager.service.offer.IOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/offer")
public class OfferController {
    @Autowired
    private IOfferService offerService;

    @GetMapping("/create")
    public ModelAndView showCreatePage() {
        return new ModelAndView("offer/create", "offer", new Offer());
    }

    @PostMapping("/create")
    public ModelAndView createOffer(@ModelAttribute("offer") Offer offer) {
        offerService.save(offer);
        return new ModelAndView("redirect:/offer/create");
    }
}

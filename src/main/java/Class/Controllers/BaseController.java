package Class.Controllers;


import Class.Entity.Accounts;
import Class.Entity.MailSender;
import Class.Entity.Subject;
import Class.Services.AccountsSer;
import Class.Services.SubjectSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class BaseController {


    @Autowired
    private AccountsSer accountsSer;
    @Autowired
    private SubjectSer subjectSer;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    private String home() {
        return "views-base-home";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    private String home1(@RequestParam("email") String email) {
        Random r = new Random();
          Accounts accounts = accountsSer.findOneById(1);
            Subject subject = subjectSer.findOneById(r.nextInt(5));
            MailSender mailSender = new MailSender(accounts.getEmail(), accounts.getPassword());
            mailSender.send(subject.getText(), "hello bro", accounts.getEmail(), email);

        return "redirect:/";

    }

}
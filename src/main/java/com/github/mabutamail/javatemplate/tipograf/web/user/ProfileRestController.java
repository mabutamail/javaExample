package com.github.mabutamail.javatemplate.tipograf.web.user;

import org.springframework.stereotype.Controller;
import com.github.mabutamail.javatemplate.tipograf.model.User;

import static com.github.mabutamail.javatemplate.tipograf.web.SecurityUtil.authUserId;

@Controller
public class ProfileRestController extends AbstractUserController {

    public User get() {
        return super.get(authUserId());
    }

    public void delete() {
        super.delete(authUserId());
    }

    public void update(User user) {
        super.update(user, authUserId());
    }
}
package io.github.hww.data.foundation.web.controller.privilege;

import io.github.hww.data.foundation.common.entities.privilege.User;
import io.github.hww.data.foundation.service.privilege.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/privilege")
public class UserController {

    private final UserService userService;

    // 使用构造函数注入
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
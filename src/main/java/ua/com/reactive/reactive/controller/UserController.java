//package ua.com.reactive.reactive.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//import ua.com.reactive.reactive.entity.User;
//import ua.com.reactive.reactive.service.UserService;
//import org.springframework.security.access.annotation.Secured;
//
//@RestController
//@RequestMapping("/users")
//@RequiredArgsConstructor(onConstructor_ = {@Autowired})
//
//public class UserController {
//
//    private final UserService userService;
//
////    @Secured("hasRole('Admin')")
//    @GetMapping
//    public Flux<User> list(
//            @RequestParam(defaultValue = "0") Long start,
//            @RequestParam(defaultValue = "3") Long count) {
//        return userService.list();
//    }
//
//    @PostMapping
//    public Mono<User> createUser(@RequestBody User user) {
//        return userService.save(user);
//    }
//
////    @Secured("ROLE_ADMIN")
////    public String getUserData() {
////        return "This is the user data page, accessible only by admins.";
////    }
//
//
////    @GetMapping("/users")
////
////
////    public Flux<User> getUsers() {
////        Flux<User> users = Flux.just(
////                        new User("John", "Kek", "+380979305729", "jek", "1111"),
////                        new User("Lyudmyla", "Serdyuk", "+380689304829", "ludo4ka", "2222"),
////                        new User("Valeriy", "Zhab", "+380739605389", "zhabka", "3333"),
////                        new User("Alina", "Robyn", "+380972797473", "alianrobyn", "4444")
////                )
////                .skip(0)
////                .take(2);
////
////        return users;
////    }
//
//
//}

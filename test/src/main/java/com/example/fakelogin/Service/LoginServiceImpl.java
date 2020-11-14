package com.example.fakelogin.Service;

import com.example.fakelogin.Entity.User;
import com.example.fakelogin.Entity.UserRepository;
import com.example.fakelogin.Payload.Request.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService{
    private final UserRepository userRepository;

    @Override
    public String login(LoginRequest request) {
        User user = User.builder()
                .userId(request.getUserId())
                .userPw(request.getUserPw())
                .build();
        userRepository.save(user);
        return "Success";
    }
}

package com.kaankaplan.LiteraryLink.controllers;

import com.kaankaplan.LiteraryLink.business.abstracts.AuthService;
import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.core.util.results.Result;
import com.kaankaplan.LiteraryLink.dto.LoginRequestDto;
import com.kaankaplan.LiteraryLink.dto.LoginResponseDto;
import com.kaankaplan.LiteraryLink.dto.RefreshRequestDto;
import com.kaankaplan.LiteraryLink.dto.UserRegisterDto;
import com.kaankaplan.LiteraryLink.modals.RegistrableUser;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth/")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("register")
    public DataResult<RegistrableUser> registerReader(@RequestBody UserRegisterDto userRegisterDto) {
        return authService.registerReader(userRegisterDto);
    }

    @PostMapping("login")
    public DataResult<LoginResponseDto> login(@RequestBody LoginRequestDto loginRequestDto) {
        return authService.login(loginRequestDto);
    }

    @PostMapping("logout")
    public Result logout(@RequestBody RefreshRequestDto refreshRequestDto) {
        return authService.logout(refreshRequestDto);
    }

    @PostMapping("refreshToken")
    public DataResult<LoginResponseDto> refreshJwtToken(@RequestBody RefreshRequestDto refreshRequestDto) {
        return authService.refreshJwtToken(refreshRequestDto);
    }

}

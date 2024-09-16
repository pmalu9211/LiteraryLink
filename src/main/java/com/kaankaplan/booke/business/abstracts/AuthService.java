package com.kaankaplan.LiteraryLink.business.abstracts;

import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.core.util.results.Result;
import com.kaankaplan.LiteraryLink.dto.LoginRequestDto;
import com.kaankaplan.LiteraryLink.dto.LoginResponseDto;
import com.kaankaplan.LiteraryLink.dto.RefreshRequestDto;
import com.kaankaplan.LiteraryLink.dto.UserRegisterDto;
import com.kaankaplan.LiteraryLink.modals.RegistrableUser;

public interface AuthService {

    DataResult<RegistrableUser> registerReader(UserRegisterDto userRegisterDto);

    DataResult<LoginResponseDto> login(LoginRequestDto loginRequestDto);
    Result logout(RefreshRequestDto refreshRequestDto);

    DataResult<LoginResponseDto> refreshJwtToken(RefreshRequestDto refreshRequestDto);
}

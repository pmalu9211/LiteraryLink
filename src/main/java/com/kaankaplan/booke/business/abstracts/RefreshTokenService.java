package com.kaankaplan.LiteraryLink.business.abstracts;

import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.core.util.results.Result;
import com.kaankaplan.LiteraryLink.modals.RefreshToken;

public interface RefreshTokenService {

    DataResult<RefreshToken> generateRefreshToken(String email);

    DataResult<RefreshToken> getRefreshToken(String refreshToken);

    Result deleteToken(String refreshToken);
}

package com.kaankaplan.LiteraryLink.business.abstracts;

import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.modals.RegistrableUser;

public interface RegistrableUserService {

    DataResult<RegistrableUser> getUserByEmail(String email);

    DataResult<RegistrableUser> getUserById(String userId);

    DataResult<RegistrableUser> save(RegistrableUser registrableUser);

}

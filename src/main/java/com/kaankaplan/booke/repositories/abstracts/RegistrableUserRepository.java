package com.kaankaplan.LiteraryLink.repositories.abstracts;

import com.kaankaplan.LiteraryLink.modals.RegistrableUser;

public interface RegistrableUserRepository {

    RegistrableUser getUserById(String id);

    RegistrableUser getUserByEmail(String email);

    RegistrableUser save(RegistrableUser registrableUser);
}

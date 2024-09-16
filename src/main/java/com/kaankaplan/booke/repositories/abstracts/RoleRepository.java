package com.kaankaplan.LiteraryLink.repositories.abstracts;

import com.kaankaplan.LiteraryLink.modals.Role;

public interface RoleRepository {

    Role getRoleByName(String roleName);

    Role addNewRole(Role role);

    void deleteRole(String roleName);
}

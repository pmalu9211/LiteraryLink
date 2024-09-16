package com.kaankaplan.LiteraryLink.business.abstracts;

import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.core.util.results.Result;
import com.kaankaplan.LiteraryLink.modals.Role;

public interface RoleService {

    DataResult<Role> getRoleByName(String roleName);

    DataResult<Role> addNewRole(String roleName);

    Result deleteRole(String roleName);
}

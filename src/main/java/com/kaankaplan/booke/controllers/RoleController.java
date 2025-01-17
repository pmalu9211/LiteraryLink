package com.kaankaplan.LiteraryLink.controllers;

import com.kaankaplan.LiteraryLink.business.abstracts.RoleService;
import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.core.util.results.Result;
import com.kaankaplan.LiteraryLink.modals.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role/")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @PostMapping("addRole/{roleName}")
    public DataResult<Role> addNewRole(@PathVariable String roleName) {
        return roleService.addNewRole(roleName);
    }

    @PostMapping("deleteRole/{roleName}")
    public Result deleteRole(@PathVariable String roleName) {
        return roleService.deleteRole(roleName);
    }
}

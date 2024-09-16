package com.kaankaplan.LiteraryLink;

import com.kaankaplan.LiteraryLink.business.abstracts.RoleService;
import com.kaankaplan.LiteraryLink.business.concretes.RoleServiceImpl;
import com.kaankaplan.LiteraryLink.modals.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@RequiredArgsConstructor
public class LiteraryLinkApplication implements CommandLineRunner {

    private final RoleService roleService;
    public static void main(String[] args) {
        SpringApplication.run(LiteraryLinkApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Role role = roleService.getRoleByName("READER").getData();
        if(role == null)
            roleService.addNewRole("READER");
    }

}

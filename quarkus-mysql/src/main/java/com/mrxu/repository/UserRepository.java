package com.mrxu.repository;

import com.mrxu.entity.User;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * @author jlxu@telenav.cn
 * @date 2021/6/24 14:56
 */
@ApplicationScoped
public class UserRepository{
    @Inject
    EntityManager em;

    @Transactional
    public void createUser() {
        User user = new User();
        user.setName("jlxu");
        user.setAge(1);
        user.setId(1L);
        em.persist(user);
    }
}

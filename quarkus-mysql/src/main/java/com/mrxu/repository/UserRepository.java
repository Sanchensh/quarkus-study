package com.mrxu.repository;

import com.mrxu.entity.User;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jlxu@telenav.cn
 * @date 2021/6/24 14:56
 */
@ApplicationScoped
public class UserRepository {
    @Inject
    EntityManager em;

    @Transactional
    public void createUser() {
        User user = new User();
        user.setName("jlxu");
        user.setAge(1);
        user.setId(1L);
        em.persist(user);
        em.flush();//commit transaction
    }

    @Transactional
    public List findAll() {
        Query nativeQuery = em.createNativeQuery("select id,name,age from user", User.class);
        return nativeQuery.getResultList();
    }
}

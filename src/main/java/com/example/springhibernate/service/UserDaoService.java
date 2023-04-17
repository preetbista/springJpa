package com.example.springhibernate.service;

import com.example.springhibernate.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDaoService {
    @PersistenceContext
    private EntityManager entityManager;
    public Long insert(User user){
        entityManager.persist(user);
        return user.getId();
    }
}

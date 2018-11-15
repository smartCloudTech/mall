package com.gsww.dao.Impl;

import com.gsww.dao.UserDao;
import com.gsww.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Override
    public User queryUserByExample(User user) {
        List<User> list = (List<User>) hibernateTemplate.find("from User u  where u.name=? and u.password=?", user.getName(), user.getPassword());
        User temp =null;
        for(User u:list){
            temp=u;
        }
        return temp;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void saveUser(User user) {
        hibernateTemplate.save(user);
    }
}
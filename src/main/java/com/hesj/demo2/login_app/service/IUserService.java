package com.hesj.demo2.login_app.service;

import com.hesj.demo2.login_app.domin.User;

public interface IUserService {
      User queryByName(String username);
      void insert(User user);

    User queryByNameByCache(String username) throws Exception ;
}

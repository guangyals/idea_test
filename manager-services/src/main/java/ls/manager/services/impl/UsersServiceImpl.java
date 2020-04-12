package ls.manager.services.impl;


import ls.manager.mapper.UsersMapper;
import ls.manager.pojo.Users;
import ls.manager.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {

        this.usersMapper.insertUser(users);
    }
}

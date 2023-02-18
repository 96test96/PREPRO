package jm.task.core.jdbc;

import com.mysql.cj.jdbc.DatabaseMetaData;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main  {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        Util.getSessionFactory();
        userService.createUsersTable();
        userService.saveUser("Иван", "Сергеев", (byte) 78);
        userService.saveUser("Дмитрий", "Баев", (byte) 74);
        userService.saveUser("Алесандр", "Антипов", (byte) 59);
        userService.saveUser("Владимир", "Махров", (byte) 74);
        userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

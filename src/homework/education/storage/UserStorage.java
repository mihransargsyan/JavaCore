package homework.education.storage;

import homework.education.model.User;
import homework.education.util.FileUtil;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {

    private Map<String, User> userMap = new HashMap<>();

    public void initData() {
        Map<String, User> userMapFromFile = FileUtil.deserialazeUserMap();
        if (userMapFromFile != null) {
            userMap = userMapFromFile;
        }
    }

    public void add(User user) {
        userMap.put(user.getEmail(), user);
        FileUtil.serialazeUser(userMap);
    }

    public User getByEmail(String email) {
        return userMap.get(email);
    }

    public void printUsers() {
        for (User values : userMap.values()) {
            System.out.println(values);
        }
    }

    public void deleteUser(String email) {
        userMap.remove(email);
        FileUtil.serialazeUser(userMap);
    }

}

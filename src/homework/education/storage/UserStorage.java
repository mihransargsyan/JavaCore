package homework.education.storage;

import homework.education.model.User;

public class UserStorage {

    private User[] users = new User[10];
    int size = 0;

    public void add(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, size);
        users = tmp;
    }

    public String emailPassword(String email, String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email) && users[i].getPassword().equals(password)) {
                    return users[i].getType();
            }
        }
        System.err.println("Invalid " + email + " & " + password);
        return null;
    }

    public User getByemail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }

}

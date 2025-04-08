package io.github.vicen621;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
    private List<User> users;

    public Twitter() {
        users = new ArrayList<>();
    }

    /**
     * Crea un usuario con el nombre dado
     * @param screenName El nombre del usuario
     * @return El usuario. Null si ya existe un usuario con ese nombre
     */
    public User addUser(String screenName) {
        if (userExists(screenName))
            return null;

        User user = new User(screenName);
        this.users.add(user);
        return user;
    }

    /**
     * Borra un usuario
     * @param user El usuario a borrar
     */
    public void deleteUser(User user) {
        users.forEach(otherUser -> otherUser.deleteRetweetsFromUser(user));
        users.remove(user);
    }


    /**
     * Verifica si existe un usuario que el nombre dado
     * @param screenName el nombre a verificar
     * @return true si existe un usuario. Falso en caso contrario
     */
    private boolean userExists(String screenName) {
        return users.stream().anyMatch(user -> user.getScreenName().equals(screenName));
    }
}

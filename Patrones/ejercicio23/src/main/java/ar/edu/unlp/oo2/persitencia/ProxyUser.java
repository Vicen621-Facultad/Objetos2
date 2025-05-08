package ar.edu.unlp.oo2.persitencia;

import java.util.List;

public class ProxyUser implements PersistableUser {
    private User user;
    private boolean cachedPosts;

    public ProxyUser(String username, String email) {
        this.user = new User(username, email);
        this.cachedPosts = false;
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public List<Post> getPosts() {
        if (this.cachedPosts) {
            this.user.addPosts(new PostRepository().findPostsByUsername(getUsername()));
            this.cachedPosts = true;
        }

        return this.user.getPosts();
    }
}

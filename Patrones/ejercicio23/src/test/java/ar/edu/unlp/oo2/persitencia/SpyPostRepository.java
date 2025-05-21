package ar.edu.unlp.oo2.persitencia;

import java.util.List;

public class SpyPostRepository extends PostRepository {
    private boolean methodCalled = false;
    private String usernameUsed = null;

    @Override
    public List<Post> findPostsByUsername(String username) {
        methodCalled = true;
        usernameUsed = username;
        return super.findPostsByUsername(username);
    }

    public boolean wasMethodCalled() {
        return methodCalled;
    }

    public String getUsernameUsed() {
        return usernameUsed;
    }
}

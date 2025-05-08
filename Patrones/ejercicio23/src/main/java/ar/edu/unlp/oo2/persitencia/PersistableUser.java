package ar.edu.unlp.oo2.persitencia;

import java.util.List;

public interface PersistableUser {
	String getUsername();
	String getEmail();
	List<Post> getPosts();
}

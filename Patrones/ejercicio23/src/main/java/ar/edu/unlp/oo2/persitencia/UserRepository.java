package ar.edu.unlp.oo2.persitencia;

import java.io.FileReader;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UserRepository {

	@SuppressWarnings("unchecked")
	public PersistableUser findUserByUsername(String aUsername) {
		JSONParser parser = new JSONParser();
		try {
			List<JSONObject> usersData = (List<JSONObject>) parser.parse(new FileReader("users.json"));
			return usersData.stream()
				.filter(userData -> userData.get("username").equals(aUsername)).findFirst()
				.map(userData -> new ProxyUser(
						userData.get("username").toString(),
						userData.get("email").toString(),
						new PostRepository()
				))
				.orElse(null);
		} catch (Exception e) {
			return null;
		}
	}

}

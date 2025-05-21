package io.github.vicen621;

public class Authenticator {
    private boolean authenticated = false;

    public void login(String username, String password) {
        // Simulación básica: si los datos son correctos, se autentica
        if (username.equals("admin") && password.equals("1234")) {
            authenticated = true;
        }
    }

    public boolean isAuthenticated() {
        return authenticated;
    }
}

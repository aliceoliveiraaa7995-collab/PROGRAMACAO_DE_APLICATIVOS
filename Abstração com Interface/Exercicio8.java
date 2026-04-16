interface Autenticacao {
    boolean login(String u, String s);
}

class UsuarioComum implements Autenticacao {
    public boolean login(String u, String s) {
        return u.equals("user") && s.equals("123");
    }
}

class Administrador implements Autenticacao {
    public boolean login(String u, String s) {
        return u.equals("admin") && s.equals("admin");
    }
}

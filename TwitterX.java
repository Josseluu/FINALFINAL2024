import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwitterX {
    public static void main(String[] args) {
        List<Usuario2> usuarios = cargarUsuariosDesdeArchivo();


        System.out.println("Menú:");
        System.out.println("1. Cargar un usuario en memoria");
        System.out.println("2. Publicar un tweet");
        System.out.println("3. Ordenar usuarios por email de forma ascendente");


        Usuario2 usuarioActual = usuarios.get(0);
        try {
            usuarioActual.publicarTweet("Este es un tweet de ejemplo.");
        } catch (ExcepciónExtendida e) {
            System.out.println("Error: " + e.getMessage());
        }


        Collections.sort(usuarios, (usuario1, usuario2) -> usuario1.getEmail().compareTo(usuario2.getEmail()));
    }

    public static List<Usuario2> cargarUsuariosDesdeArchivo() {

        List<Usuario2> usuarios = new ArrayList<>();
        usuarios.add(new Usuario2("usuario1", "usuario1@example.com"));
        usuarios.add(new Usuario2("usuario2", "usuario2@example.com"));
        return usuarios;
    }
}

class Usuario2 {
    private String alias;
    private String email;
    private List<Tweet5> tweet5s;

    public Usuario2(String alias, String email) {
        this.alias = alias;
        this.email = email;
        this.tweet5s = new ArrayList<>();
    }

    public String getAlias() {
        return alias;
    }

    public String getEmail() {
        return email;
    }

    public List<Tweet5> getTweets() {
        return tweet5s;
    }

    public void addTweet(Tweet5 tweet5) {
        tweet5s.add(tweet5);
    }

    public void publicarTweet(String contenido) throws ExcepciónExtendida {
        if (contenido.length() > 140) {
            throw new ExcepciónExtendida("El tweet no puede tener más de 140 caracteres.");
        }
        Tweet5 nuevoTweet5 = new Tweet5(contenido, this);
        addTweet(nuevoTweet5);
        System.out.println("¡Tweet publicado con éxito!");
    }

    public static Usuario2 buscarUsuario(List<Usuario2> usuarios, String alias) {
        for (Usuario2 usuario : usuarios) {
            if (usuario.getAlias().equals(alias)) {
                return usuario;
            }
        }
        return null;
    }
}

class Tweet {
    private String contenido;
    private Usuario2 remitente;

    public Tweet(String contenido, Usuario2 remitente) {
        this.contenido = contenido;
        this.remitente = remitente;
    }

    public String getContenido() {
        return contenido;
    }

    public Usuario2 getRemitente() {
        return remitente;
    }
}

class ExcepciónExtendida extends Exception {
    public ExcepciónExtendida(String mensaje) {
        super(mensaje);
    }
}


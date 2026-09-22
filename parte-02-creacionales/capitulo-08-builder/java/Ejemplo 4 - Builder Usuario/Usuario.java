public class Usuario {

    private final String nombre;
    private final String email;
    private final String telefono;
    private final String direccion;
    private final String ciudad;
    private final String pais;
    private final int edad;
    private final boolean activo;

    private Usuario(Builder builder) {

        this.nombre = builder.nombre;
        this.email = builder.email;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
        this.ciudad = builder.ciudad;
        this.pais = builder.pais;
        this.edad = builder.edad;
        this.activo = builder.activo;
    }

    public static class Builder {

        private String nombre;
        private String email;
        private String telefono;
        private String direccion;
        private String ciudad;
        private String pais;
        private int edad;
        private boolean activo;

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder ciudad(String ciudad) {
            this.ciudad = ciudad;
            return this;
        }

        public Builder pais(String pais) {
            this.pais = pais;
            return this;
        }

        public Builder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Builder activo(boolean activo) {
            this.activo = activo;
            return this;
        }

        public Usuario build() {

            return new Usuario(this);
        }
    }
}


/*
    Ahora podemos crear un usuario:

    Usuario usuario =
        new Usuario.Builder()
            .nombre("José")
            .email("jose@email.com")
            .ciudad("Palma")
            .pais("España")
            .edad(44)
            .activo(true)
            .build();

*/
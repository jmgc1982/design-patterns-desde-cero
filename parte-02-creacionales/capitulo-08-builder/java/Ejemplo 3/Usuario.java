public Usuario(
        String nombre,
        String email,
        String telefono,
        String direccion,
        String ciudad,
        String pais,
        int edad,
        boolean activo) {

    this.nombre = nombre;
    this.email = email;
    this.telefono = telefono;
    this.direccion = direccion;
    this.ciudad = ciudad;
    this.pais = pais;
    this.edad = edad;
    this.activo = activo;
}

/*
    Y usarlo:

    Usuario usuario = new Usuario(
        "José",
        "jose@email.com",
        "600000000",
        "Calle Mayor 1",
        "Palma",
        "España",
        44,
        true
    );

*/
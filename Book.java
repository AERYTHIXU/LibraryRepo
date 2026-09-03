public class Book {
    private String titulo_libro;
    private int año_publicacion;
    private int numero_paginas;
    
    public Book(String titulo_libro, int año_publicacion, int numero_paginas) {
        this.titulo_libro = titulo_libro;
        this.año_publicacion = año_publicacion;
        this.numero_paginas = numero_paginas;
    }

    public String getTitulo_libro() {
        return titulo_libro;
    }

    public void setTitulo_libro(String titulo_libro) {
        this.titulo_libro = titulo_libro;
    }

    public int getAño_publicacion() {
        return año_publicacion;
    }

    public void setAño_publicacion(int año_publicacion) {
        this.año_publicacion = año_publicacion;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }
}

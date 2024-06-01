package Ejercicio2;

class Vendedor {
    private int codigo;

    public Vendedor(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vendedor vendedor = (Vendedor) obj;
        return codigo == vendedor.codigo;
    }

    @Override
    public String toString() {
        return "Vendedor(codigo=" + codigo + ")";
    }
}


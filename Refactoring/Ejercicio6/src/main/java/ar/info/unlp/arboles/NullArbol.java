package ar.info.unlp.arboles;

public class NullArbol extends ArbolBinario {
    @Override
    public int getValor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArbolBinario getHijoDerecho() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArbolBinario getHijoIzquierdo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setHijoDerecho(ArbolBinario hijoDerecho) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setHijoIzquierdo(ArbolBinario hijoIzquierdo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setValor(int valor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String recorrerInorden() {
        return "";
    }

    @Override
    public String recorrerPostorden() {
        return "";
    }

    @Override
    public String recorrerPreorden() {
        return "";
    }
}

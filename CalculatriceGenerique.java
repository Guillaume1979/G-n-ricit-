package com.company;

public abstract class CalculatriceGenerique<V> {
    protected V X1;
    protected V X2;

    public CalculatriceGenerique(V X1, V X2) {
        this.X1 = X1;
        this.X2 = X2;
    }

    public abstract V addition();

}

package javafxapplication11;

/**
 *
 * @author Serllet
 */
public class Punto {

    private final int x;
    private final int y;

    Punto(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object otro) {
        if (!(otro instanceof Punto)) {
            return false;
        }
        Punto punto = (Punto) otro;
        return x == punto.x & y == punto.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Punto tupla(int dx, int dy) {
        return new Punto(x + dx, y + dy);
    }

    public String toString() {
        return x + ", " + y;
    }

}

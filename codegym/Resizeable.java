package codegym;

public interface Resizeable {
    default double Resize(double percent) {
        return percent + percent * Math.random() * 100;
    }
}

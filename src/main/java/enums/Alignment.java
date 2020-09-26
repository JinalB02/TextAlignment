package enums;

/**
 * Provides the possible alignment strategies.
 */
public enum Alignment {

    LEFT("-l"),
    RIGHT("-r"),
    CENTER("-c");

    private final String align;

    Alignment(String align) {
        this.align = align;
    }

    public String getAlignment() {
        return align;
    }
}

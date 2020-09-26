package constants;

/**
 * This class is used to define constants
 */
public class AlignmentConstants {
    public static final Character PADDING_SPACE = ' ';
    public static final Integer MIN_LINE_WIDTH = 2;
    public static final Integer MAX_LINE_WIDTH = 1000;
    public static final String NEW_LINE = "\n";
    public static final String NON_NUMERIC_LINE_WIDTH = "The line width %s provided is either non-numeric or too large. " +
            " It must be within the range of " + MIN_LINE_WIDTH + " and " + MAX_LINE_WIDTH + ".";
    public static final String INVALID_INPUT_CONTENT = "The content of the file is invalid! ";
    public static final String FILE_NOT_FOUND = "The file %s was not found!";
    public static final String FILE_NOT_NULL = "The file cannot be null!";
    public static final String NULL_ALIGNMENT_STRATEGY = "The alignment strategy cannot be null!";
    public static final String LINE_WIDTH_NULL = "The line width cannot be null!";
    public static final String MIN_LINE_WIDTH_INVALID = "The line width %d is invalid. It must be greater than 2!";
    public static final String INVALID_LINE_WIDTH = "The line width %d is invalid. It must be within the range of " +
            +MIN_LINE_WIDTH + " and " + MAX_LINE_WIDTH;
    public static final String INVALID_INPUT = "The input provided is invalid. It should have 3 parameters:" +
            "\n1.Alignment Strategy(-l for left, -r for right -c for center)" +
            "\n2.Maximum line width" +
            "\n3.File path";
    public static final String INVALID_ALIGNMENT_STRATEGY = "The alignment strategy %s is invalid. " +
            "\nValid values are:\n1. -l for left alignment" +
            "\n2. -r for right alignment" +
            "\n3. -c for center alignment";
}

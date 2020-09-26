import exceptions.InvalidUserInputException;
import output.AlignedTextDisplay;
import reader.FileReader;
import strategy.AlignmentStrategy;
import strategy.align.IAlignmentStrategy;
import validator.InputValidator;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * This class aligns the text based on the inputs provided
 */
public class TextAlignmentApp {

    private static IAlignmentStrategy strategy;

    /**
     * To starting point of the application
     *
     * @param args
     * @throws InvalidUserInputException
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws InvalidUserInputException {
        // start the application
        startApp(args);
    }

    /**
     * This method starts the application
     *
     * @param args
     * @throws InvalidUserInputException
     * @throws FileNotFoundException
     */
    private static void startApp(String[] args) throws InvalidUserInputException {
        String inputContent;
        String alignmentStrategy;
        Integer lineWidth;
        InputValidator inputValidator = new InputValidator();
        inputValidator.validateUserInput(args);
        alignmentStrategy = inputValidator.validateAlignmentStrategy(args[0]);
        lineWidth = inputValidator.validateLineWidth(args[1]);
        inputContent = FileReader.read(new File(args[2]));
        inputValidator.validateInputContent(inputContent);

        // get the correct alignment strategy based on the input
        strategy = new AlignmentStrategy().choseStrategy(alignmentStrategy);
        // display the aligned text
        new AlignedTextDisplay().display(strategy.alignText(lineWidth, inputContent));

    }
}

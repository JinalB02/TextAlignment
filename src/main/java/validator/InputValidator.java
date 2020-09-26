package validator;

import constants.AlignmentConstants;
import enums.Alignment;
import exceptions.InvalidUserInputException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.format;

/**
 * Validate the input provided by the user
 */
public class InputValidator {

    /**
     * Checks if the input is valid i.e
     * 1. It should have some content
     *
     * @param userInput
     */
    public static void validateUserInput(String[] userInput) throws InvalidUserInputException {
        if (null == userInput || userInput.length != 3) {
            throw new InvalidUserInputException(format(
                    AlignmentConstants.INVALID_INPUT
            ));
        }
    }

    /**
     * Checks if the input is valid i.e
     * 1. It should have some content
     *
     * @param inputContent
     */
    public static void validateInputContent(String inputContent) throws InvalidUserInputException {
        if (null == inputContent || inputContent.trim().isEmpty()) {
            throw new InvalidUserInputException(format(
                    AlignmentConstants.INVALID_INPUT_CONTENT
            ));
        }
    }

    /**
     * Checks if the line width is valid i.e
     * 1. It should be greater than 1
     * 2. It should be less than 1000
     *
     * @param lineWidthParam
     * @throws InvalidUserInputException
     */
    // TODO when number is big show correct msg
    // When sent as string in ""
    public Integer validateLineWidth(String lineWidthParam) throws InvalidUserInputException {
        Integer lineWidth;
        if (lineWidthParam == null) {
            throw new InvalidUserInputException(format(
                    AlignmentConstants.LINE_WIDTH_NULL
            ));
        } else {
            try {
                lineWidth = Integer.parseInt(lineWidthParam);
            } catch (NumberFormatException e) {
                throw new InvalidUserInputException(format(
                        AlignmentConstants.NON_NUMERIC_LINE_WIDTH, lineWidthParam
                ));
            }
        }
        if (lineWidth <= AlignmentConstants.MIN_LINE_WIDTH) {
            throw new InvalidUserInputException(format(
                    AlignmentConstants.MIN_LINE_WIDTH_INVALID, lineWidth
            ));
        }
        if (lineWidth >= AlignmentConstants.MAX_LINE_WIDTH) {
            throw new InvalidUserInputException(format(
                    AlignmentConstants.INVALID_LINE_WIDTH, lineWidth
            ));
        }
        return lineWidth;
    }

    /**
     * Checks if the alignment strategy provided is valid i.e
     * 1. Left(-l)
     * 2. Right(-r)
     * 3. Center(-c)
     *
     * @param alignmentStrategy
     * @return String
     * @throws InvalidUserInputException
     */
    public static String validateAlignmentStrategy(String alignmentStrategy) throws InvalidUserInputException {
        if (null == alignmentStrategy) {
            throw new InvalidUserInputException(format(
                    AlignmentConstants.NULL_ALIGNMENT_STRATEGY
            ));
        }
        List<String> validAlignmentStrategies = Stream.of(Alignment.values())
                .map(Alignment::getAlignment)
                .collect(Collectors.toList());
        if (!validAlignmentStrategies.contains(alignmentStrategy)) {
            throw new InvalidUserInputException(format(
                    AlignmentConstants.INVALID_ALIGNMENT_STRATEGY, alignmentStrategy
            ));
        }
        return alignmentStrategy;
    }
}

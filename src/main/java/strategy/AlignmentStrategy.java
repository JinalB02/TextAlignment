package strategy;

import constants.AlignmentConstants;
import enums.Alignment;
import exceptions.InvalidUserInputException;
import strategy.align.CenterAlignmentStrategy;
import strategy.align.IAlignmentStrategy;
import strategy.align.LeftAlignmentStrategy;
import strategy.align.RightAlignmentStrategy;

import static java.lang.String.format;

/**
 * This class chooses the right strategy class based on the input
 */
public class AlignmentStrategy {
    /**
     * Chooses the right alignment strategy
     *
     * @param alignmentStrategy
     * @return IAlignmentStrategy
     * @throws Exception
     */
    public IAlignmentStrategy choseStrategy(String alignmentStrategy) throws InvalidUserInputException {
        if (null != alignmentStrategy) {
            if (alignmentStrategy.equalsIgnoreCase(Alignment.LEFT.getAlignment())) {
                return new LeftAlignmentStrategy();
            } else if (alignmentStrategy.equalsIgnoreCase(Alignment.RIGHT.getAlignment())) {
                return new RightAlignmentStrategy();
            } else if (alignmentStrategy.equalsIgnoreCase(Alignment.CENTER.getAlignment())) {
                return new CenterAlignmentStrategy();
            } else {
                throw new InvalidUserInputException(format(
                        AlignmentConstants.INVALID_ALIGNMENT_STRATEGY, alignmentStrategy
                ));
            }
        } else {
            throw new InvalidUserInputException(format(
                    AlignmentConstants.NULL_ALIGNMENT_STRATEGY
            ));

        }
    }
}

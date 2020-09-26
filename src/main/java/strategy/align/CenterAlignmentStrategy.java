package strategy.align;

import constants.AlignmentConstants;

import java.util.List;
import java.util.ListIterator;

/**
 * This class is used for aligning the content to Center
 */
public class CenterAlignmentStrategy extends IAlignmentStrategy {

    /**
     * Center aligns the text
     *
     * @param lineWidth
     * @param inputContent
     * @return String
     */
    public String alignText(int lineWidth, String inputContent) {
        List<String> lines = splitInputContentLines(inputContent, lineWidth);
        ListIterator<String> linesItr = lines.listIterator();
        StringBuilder formattedContent = new StringBuilder();
        while (linesItr.hasNext()) {
            String line = linesItr.next();
            int noOfSpaces = lineWidth - line.length();
            pad(formattedContent, noOfSpaces / 2);
            formattedContent.append(line);
            pad(formattedContent, noOfSpaces - noOfSpaces / 2);
            formattedContent.append(AlignmentConstants.NEW_LINE);
        }
        return formattedContent.toString();
    }
}

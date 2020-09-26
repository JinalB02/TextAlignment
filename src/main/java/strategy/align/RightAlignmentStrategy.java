package strategy.align;

import constants.AlignmentConstants;

import java.util.List;
import java.util.ListIterator;

/**
 * This class is used for aligning content to right
 */
public class RightAlignmentStrategy extends IAlignmentStrategy {

    /**
     * Right aligns the text
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
            pad(formattedContent, lineWidth - line.length());
            formattedContent.append(line);
            formattedContent.append(AlignmentConstants.NEW_LINE);
        }
        return formattedContent.toString();
    }
}

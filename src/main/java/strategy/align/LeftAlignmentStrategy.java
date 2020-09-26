package strategy.align;

import constants.AlignmentConstants;

import java.util.List;
import java.util.ListIterator;

/**
 * This class is used for justifying content to Left
 */
public class LeftAlignmentStrategy extends IAlignmentStrategy {

    /**
     * Left strategy align the text
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
            formattedContent.append(line);
            pad(formattedContent, lineWidth - line.length());
            formattedContent.append(AlignmentConstants.NEW_LINE);
        }
        return formattedContent.toString();
    }
}

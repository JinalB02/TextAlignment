package strategy.align;

import constants.AlignmentConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class used in the process of the alignment content
 */
public abstract class IAlignmentStrategy {
    /**
     * This method is used to alignText content
     *
     * @param lineWidth
     * @param inputContent
     * @return String
     */
    public abstract String alignText(int lineWidth, String inputContent);

    /**
     * Add spaces to the content
     *
     * @param content
     * @param noOfSpaces
     */
    protected final void pad(StringBuilder content, int noOfSpaces) {
        for (int i = 0; i < noOfSpaces; i++)
            content.append(AlignmentConstants.PADDING_SPACE);
    }

    /**
     * Splits the input content to the no of lines as per the line width
     *
     * @param inputContent
     * @param lineWidth
     * @return List<String>
     */
    protected List<String> splitInputContentLines(String inputContent, Integer lineWidth) {
        List<String> splitLines = new ArrayList<>();
        if (null == inputContent && !inputContent.isEmpty()) {
            return splitLines;
        }
        if (null != lineWidth && lineWidth > 1) {
            char[] chars = inputContent.toCharArray();
            boolean endOfString = false;
            int startIndex = 0;
            int endIndex;
            while (startIndex < chars.length - 1) {
                int charCount = 0;
                int lastSpace = 0;
                while (charCount < lineWidth) {
                    if (chars[charCount + startIndex] == AlignmentConstants.PADDING_SPACE) {
                        lastSpace = charCount;
                    }
                    charCount++;
                    if (charCount + startIndex == inputContent.length()) {
                        endOfString = true;
                        break;
                    }
                }
                endIndex = endOfString ? inputContent.length()
                        : (lastSpace > 0) ? lastSpace + startIndex : charCount + startIndex;
                splitLines.add(inputContent.substring(startIndex, endIndex).trim());
                if (endIndex + 1 != AlignmentConstants.PADDING_SPACE) {
                    startIndex = endIndex;
                } else {
                    startIndex = endIndex + 1;
                }
            }
        }
        return splitLines;
    }
}

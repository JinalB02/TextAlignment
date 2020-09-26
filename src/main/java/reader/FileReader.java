package reader;

import constants.AlignmentConstants;
import exceptions.InvalidUserInputException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.String.format;

/**
 * This class reads the data from a file
 */
public class FileReader {
    /**
     * Read the content of the file
     *
     * @param file
     * @return String
     */
    public static String read(File file) throws InvalidUserInputException {
        StringBuilder fileContent = new StringBuilder();
        Scanner scanner = null;
        if (null == file) {
            throw new InvalidUserInputException(format(
                    AlignmentConstants.FILE_NOT_NULL
            ));
        }
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                fileContent.append(scanner.nextLine());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            throw new InvalidUserInputException(format(
                    AlignmentConstants.FILE_NOT_FOUND, file.getName())
            );
        }
        return fileContent.toString();
    }
}

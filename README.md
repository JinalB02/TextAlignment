# TextAlignment

This application needs 3 inputs from the user
   1.	Alignment Strategy
         - It is the strategy with which you want to align your text display in the console. 
           * -l for left alignment
           * -r for right alignment
           * -c for center alignment
   2.	 Maximum Line Width
         - Give the maximum line width of the text to be displayed in the console. 
         - The line width must be greater than 2 and less than 1000 (these values are configurable).
         - You can update MIN_LINE_WIDTH and MAX_LINE_WIDTH in constants/AlignmentConstants.java to change the above the values.
   3.	File path
         - Provide the path of the file whose contents you want to align. 
         - A sample file is present at location -> src/main/resources/input-file.txt

    
e.g Content of  src/main/resources/input-file.txt

        Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor
        invidunt ut labore et dolore
        magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et
        ea rebum. Stet clita kasd
        gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor
        sit amet, consetetur sadipscing
        elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat,
        sed diam voluptua. At vero eos
        et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea
        takimata sanctus est Lorem ipsum dolor
        sit amet.
    
 User Input Example:
        - Provide the user input as a command line arguments.
 
    -r 64 src/main/resources/input-file.txt
    
 Output:
 
        Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed
          diam nonumy eirmod temporinvidunt ut labore et doloremagna 
         aliquyam erat, sed diam voluptua. At vero eos et accusam et
      justo duo dolores etea rebum. Stet clita kasdgubergren, no sea
        takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum
          dolorsit amet, consetetur sadipscingelitr, sed diam nonumy
           eirmod tempor invidunt ut labore et dolore magna aliquyam
          erat,sed diam voluptua. At vero eoset accusam et justo duo
      dolores et ea rebum. Stet clita kasd gubergren, no seatakimata
                              sanctus est Lorem ipsum dolorsit amet.

Overview:
The ControlSpacecraft program simulates the movement of a spacecraft in a 3D space based on a series of commands. 
It takes an initial position, initial direction, and a list of commands as input, and returns the final position and direction of the spacecraft after executing the commands.

Classes and Methods:
Main Class:

public static void main(String[] args): This is the entry point of the program. It initializes the starting position, direction, and command list, then calls the controlSpacecraft method to execute the commands. Finally, it prints the final position and direction of the spacecraft.

public static Map<String, Integer> controlSpacecraft(Map<String, Integer> initialPosition, char initialDirection, char[] commands): This method takes the initial position, initial direction, and list of commands as input parameters. It iterates through each command, updates the position and direction of the spacecraft accordingly, and returns the final position and direction as a map.

Helper Methods:

static {...}: This static block initializes a DIRECTIONS_MAP, which maps direction characters ('N', 'E', 'S', 'W', 'U', 'D') to their corresponding indices (0, 1, 2, 3, 4, 5) in the directions array.
Method Details:
controlSpacecraft Method:
Input Parameters:
initialPosition: A map containing the initial x, y, and z coordinates of the spacecraft.
initialDirection: The initial direction of the spacecraft ('N', 'E', 'S', 'W', 'U', or 'D').
commands: An array of characters representing the commands to be executed by the spacecraft ('f' - move forward, 'b' - move backward, 'l' - turn left, 'r' - turn right, 'u' - move up, 'd' - move down).
Output:
A map containing the final x, y, and z coordinates of the spacecraft, along with the final direction.
Functionality:
Initializes a position map with the initial position.
Retrieves the index of the initial direction from the DIRECTIONS_MAP.
Iterates through each command:
For forward and backward commands ('f' and 'b'), updates the z-coordinate of the position based on the current direction index.
For left and right commands ('l' and 'r'), updates the direction index accordingly.
For up and down commands ('u' and 'd'), updates the y-coordinate of the position if the current direction is not 'D' or 'U'.
Stores the final direction in the result map and returns it.
Error Handling:
Exceptions occurring during command execution are caught using a try-catch block within the controlSpacecraft method. If an exception occurs, it is printed to the console using e.printStackTrace().
Usage:
To use the program, instantiate the Main class, provide the initial position, initial direction, and command list, and call the controlSpacecraft method. The program will return the final position and direction of the spacecraft after executing the commands.
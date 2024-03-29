Instructions to run the Java program --

1.Check Java Version: Verify if Java is installed on your system and the version by running:  java -version


2.Set Up Java Development Kit (JDK)

3.Compile Java Files: Compile your Java source files using the javac command. Navigate to the directory containing your Java files and run:  javac SpaceCraftTest.java Spacecraft.java

4. Execute Java Program: Run the main Java program using the java command. If the main method is in Spacecraft.java, run:  java Spacecraft








Description
As a scientist at ISRO controlling the latest lunar spacecraft Chandrayaan 3, your task is to develop a program that translates commands sent from Earth into instructions understood by the spacecraft. The spacecraft navigates through the galaxy using galactic coordinates, represented by x, y, z coordinates (x for east or west location, y for north or south location, and z for distance above or below the galactic plane).

Requirements
You will be given the initial starting point (x, y, z) of the spacecraft and the direction it is facing (N, S, E, W, Up, Down). The spacecraft receives a character array of commands, and you are required to implement the following functionalities:

Move the spacecraft forward/backward (f, b): The spacecraft moves one step forward or backward based on its current direction.
Turn the spacecraft left/right (l, r): The spacecraft rotates 90 degrees to the left or right, changing its facing direction.
Turn the spacecraft up/down (u, d): The spacecraft changes its angle, rotating upwards or downwards.

Example
Given the starting point (0, 0, 0) following (x, y, z) and initial direction N, the following commands should result in the indicated final position and direction:

Commands: [“f”, “r”, “u”, “b”, “l”]

Starting Position: (0, 0, 0)

Initial Direction: N

“f” - (0, 1, 0) - N “r” - (0, 1, 0) - E “u” - (0, 1, 0) - U “b” - (0, 1, -1) - U “l” - (0, 1, -1) - N

Final Position: (0, 1, -1)

Final Direction: N

Your task is to design the program that enables Chandrayaan 3 to execute these commands accurately and efficiently in the vast expanse of the galaxy:

Make sure to take an incremental approach and show it in the commits
Keep your code clean, readable, and modularized
Do not throw exceptions/handle cases for invalid arguments

# Incubyte_Remote
Chandrayaan 3 Spacecraft Control Program

This program enables the control of the Chandrayaan 3 spacecraft, allowing it to execute commands accurately and efficiently in the vast expanse of the galaxy.

Requirements
The initial starting point (x, y, z) of the spacecraft and its initial direction (N, S, E, W, Up, Down) are provided.
The spacecraft receives a character array of commands to perform certain functionalities:
Move the spacecraft forward/backward (f, b)
Turn the spacecraft left/right (l, r)
Turn the spacecraft up/down (u, d)
The spacecraft cannot move or rotate diagonally.
Assume rigid movement and rotations, and boundaries for movement within the galaxy.
Example
Given the starting point (0, 0, 0) with initial direction N and commands [“f”, “r”, “u”, “b”, “l”], the program should result in the following final position and direction:

Starting Position: (0, 0, 0)
Initial Direction: N

“f” - (0, 1, 0) - N
“r” - (0, 1, 0) - E
“u” - (0, 1, 0) - U
“b” - (0, 1, -1) - U
“l” - (0, 1, -1) - N
Final Position: (0, 1, -1)
Final Direction: N


Functionality Implemented
moveForward(): Move the spacecraft one step forward based on its current direction.
moveBackward(): Move the spacecraft one step backward based on its current direction.
turnLeft(): Rotate the spacecraft 90 degrees to the left, changing its facing direction.
turnRight(): Rotate the spacecraft 90 degrees to the right, changing its facing direction.
turnUp(): Rotate the spacecraft upwards, changing its angle.
turnDown(): Rotate the spacecraft downwards, changing its angle.

How to Use
Compile and run the Java program.
Provide the initial starting point and direction of the spacecraft.
Input the desired sequence of commands to control the spacecraft.
View the final position and direction of the spacecraft after executing the commands.
# library
This program is supposed to simulate the system of a college library. It's a very basic version of that kind of system.

I used Java to type it and it's programmed under the POO paradigm. I also used Java Swing to develop the graphical interface.

The graphical interface is composed of several frames which perform certain functions.

The first frame is FrMainMenu, which has the objective to allow access to the users. Since this is a simulation, there is not a database where the user information is stored. Instead, there is a .txt file with this information. The users (and their passwords) are the following:

Usuario1,45h91
Usuario2,45h92
Usuario3,45h93
Usuario4,45h94
Usuario5,45h95

These usernames allow us to sign up and work with the system.

The second frame is FrMainMenu. This frame is meant to contain the others.

The third frame is MainMenu. This frame welcomes the user and displays a table where the number of materials of each category can be seen.

The fourth frame is NewData. This frame allows the user to register any new information. It has the necessary fields to retrieve new data about a book, magazine, or film. There is not a database where this information can be stored, but there is a .txt file for this. Nonetheless, a connection between the application and a server might be created.

The fifth frame is Consultation. This frame shows the total number of materials for each category.

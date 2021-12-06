# Call Billing

It was asked to do a billing system with several requirements, for example, the call costs. 

Is a billing system that manages the different prices of calls, made to local, national and international locations in a specific month, and finally delivers a bill with all the details.

# Structure

The project is divided in two packages, the Entity package, which has 4 entities and the Services package; this package has the service class of the entity package, it means that the logic of the project is inside those classes. 

![alt text](https://github.com/OrtizGeronimo/Facturacion_Llamadas/blob/master/Files/Structure.png?raw=true)

# Funcionality

Basically the system first makes a simulation of a database, creating and saving some locations to later link them with the call. Then the calls are created, and relationated with some of the locations created.
After the creation of the calls, the costs are calculated, and finally, with all the information, the system is ready to create the bill. It first ask the month to bill, and search all the calls made in that month, divides them in the different type that the calls can be. And calculates the total of the bill.


Here is an example of the output of the project, it has been made three calls in december, one to local, two the foreign

![alt text](https://github.com/OrtizGeronimo/Facturacion_Llamadas/blob/master/Files/Bill.png?raw=true)

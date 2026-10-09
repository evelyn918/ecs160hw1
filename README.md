Part A 

The design pattern could not be fully implemented in Python.
While name mangling hides the variable, it does not protect it as private does in Java or C++. 
In this implementation, only the second construction attempt is guarded and will fail to create a new instance.
If someone used Configuration() then Configuration.get_instance(), this would pass and allow code outside 
the class to construct the object. 

Part B 
The built in python decorator @log is a part of the class definition. As such, every object must be logged. 
Also, @log requires making modifications to the class. 
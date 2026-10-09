#ifndef CONFIGURATION_H
#define CONFIGURATION_H

#include <string>

class Configuration {
public:

    static Configuration& getInstance(); //reference of instance 
    Configuration(const Configuration&) = delete; //delete copy constructor 
    Configuration& operator = (const Configuration&) = delete; //delete copy assignment operator 


private:

    std::string appName;
    std::string logLevel;
    int maxConnections;
    bool debugMode;
    Configuration(); // constructor 
};

#endif

#include "Configuration.h"

Configuration :: Configuration()
    : appName("ECS160-HW1"), logLevel("INFO"), maxConnections(32), debugMode(true){ //initializer list with default values 
}

Configuration& Configuration::getInstance(){
    static Configuration instance; 
    return instance; 
}




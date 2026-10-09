class Configuration:
    __instance = None # name mangling, this is a class attribute 

    # constructor 
    def __init__ (self): 
        # error for creation of a second object, prevents overwritting 
        if Configuration.__instance is not None:
            raise Exception("Configuration is a singleton, use get_instance()")
        
        # init vals 
        self.appName = "ECS160-HW1"
        self.logLevel = "INFO"
        self.maxConnections = 32 
        self.debugMode = True 
        Configuration.__instance = self

    @classmethod
    def get_instance(cls):
        # if instance is None, create one
        if cls.__instance is None:
            cls() # create instance 
        # return the stored instance
        return Configuration.__instance 
   # pass
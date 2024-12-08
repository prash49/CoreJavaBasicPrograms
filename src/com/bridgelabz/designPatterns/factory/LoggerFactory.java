package com.bridgelabz.designPatterns.factory;

public class LoggerFactory {

    public static Logger getLogger(String name) {
        /*TODO writing code which i usually does*/
      /*

        Logger logger;
        switch (name) {
            case "Console":
                logger = new ConsoleLogger();
                break;
            case "DataBase":
                logger = new DataBaseLogger();
                break;
            case "File":
                logger = new FileLogger();
                break;
            default:
                throw new IllegalArgumentException("Unknow logger type");
        }
        return logger;


       */



        /*TODO above code can be optimized by removing break and logger and directly return*/

       /* switch (name) {
            case "Console":
                return  new ConsoleLogger();
            case "DataBase":
                 return new DataBaseLogger();

            case "File":
                return   new FileLogger();
            default:
                throw new IllegalArgumentException("Unknow logger type");
        }*/

        /* TODO it can further optimized by lamda expression */
        return switch(name){
            case "Console" -> new ConsoleLogger();
            case "File" -> new FileLogger();
            case "Database" -> new DataBaseLogger();
          default -> throw new IllegalStateException("Unexpected value: " + name);
        };
    }
}

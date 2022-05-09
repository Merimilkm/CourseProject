package com.nyha.webfinal.controller.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

public class CommandProvider {
    static Logger logger = LogManager.getLogger();


    public static Optional<Command> defineCommand(String commandName) {
        Optional<Command> current;
        if(commandName == null || commandName.isBlank()){
            return  Optional.empty();
        }
        try {
            CommandType type = CommandType.valueOf(commandName.toUpperCase());
            current = Optional.of(type.getCurrentCommand());
        } catch (IllegalArgumentException e) {
            logger.error("Illegal argument exception, unknown command", e);
            current = Optional.empty();
        }
        return current;
    }
}

package co.uk.bigredlobster.password;

import org.apache.commons.cli.*;

import java.util.List;

class Parser {

    List<String> doIt(String[] args) {
        DefaultParser parser = new DefaultParser();
        try {
            CommandLine parse = parser.parse(new Options(), args);
            List<String> argList = parse.getArgList();
            if (argList.isEmpty())
                    throw new RuntimeException("Empty Args");
            else if (argList.size() < 4)
                throw new RuntimeException("Need 4 args");
            return argList;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

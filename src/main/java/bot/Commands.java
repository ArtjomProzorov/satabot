package bot;

import java.util.Arrays;
import java.util.StringJoiner;

public enum Commands {

    WEBSITE("/website"),
    ROADMAP("/roadmap"),
    TEAM("/team"),
    CONTRACT("/contract"),
    DEXTOOLS("/dextools"),
    CHART("/chart"),
    PARTNERS("/partners"),
    TWITTER("/twitter"),
    COMMANDS("/commands"),
    TWEETS("/tweets");

    private final String value;


    Commands(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String commandsAsString() {
        StringJoiner joiner = new StringJoiner("\n");
        Arrays.stream(Commands.values())
                .map(Commands::getValue)
                .forEach(joiner::add);
        return joiner.toString();
    }

}
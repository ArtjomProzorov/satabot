package bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class SataBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "SatazaurBot";
    }

    @Override
    public String getBotToken() {
        return "5056594787:AAGQt7yhxsPXDY-iKlFtdUW_Mp1tjrT6LmQ";
    }


    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage(String.valueOf(update.getMessage().getChatId()), "");
            message.setParseMode(ParseMode.HTML);
            message.disableWebPagePreview();

            String telegramUserCommand = update.getMessage().getText().toLowerCase();

            if (telegramUserCommand.equals(Commands.COMMANDS.getValue())) {
                message.setText(Commands.COMMANDS.commandsAsString());
            }

            if (telegramUserCommand.equals(Commands.WEBSITE.getValue())) {
                message.setText(LINKS.WEB.getValue());
            }

            if (telegramUserCommand.equals(Commands.TWITTER.getValue())) {
                message.setText(LINKS.TWITTER.getValue());
            }

            if (telegramUserCommand.equals(Commands.TWEETS.getValue())) {
                message.setText(LINKS.LATESTTWEETS.getValue());
            }

            if (telegramUserCommand.equals(Commands.DEXTOOLS.getValue()) || telegramUserCommand.equals(Commands.CHART.getValue())) {
                message.setText(LINKS.DEXTOOL.getValue());
            }

            if (telegramUserCommand.equals(Commands.ROADMAP.getValue())) {
                message.setText(LINKS.ROADMAP.getValue());
            }
            if (telegramUserCommand.equals(Commands.TEAM.getValue())) {
                message.setText(LINKS.TEAM_LINKEDIN.getValue());
            }

            if (telegramUserCommand.equals(Commands.CONTRACT.getValue())) {
                message.setText(LINKS.BUYLINKS.getValue());
            }

            if (telegramUserCommand.equals(Commands.PARTNERS.getValue())) {
                message.setText(LINKS.PARTNERS.getValue());
            }
            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}


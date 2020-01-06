package ru.progwards.java1.lessons.telegrambot;

import org.telegram.telegrambots.ApiContextInitializer;
import ru.progwards.java1.testlesson.ProgwardsTelegramBot;

import java.util.Random;

public class GeneratorPassword extends ProgwardsTelegramBot {
    private final String pass = "Я умею генерировать пароли!";

    static private String[] data = {"Q", "q", "W", "w", "E", "e", "R", "r", "T", "t", "A", "a", "S", "s", "F", "f",
            "G", "g", "Z", "z", "X", "x", "C", "c", "V", "v", "B", "b", "Y", "y", "U", "u", "I", "i", "O", "o",
            "{", "[", "}", "}", "H", "h", "J", "j", "K", "k", "L", "l", ":", ";", "", "N", "n", "M", "m", "<",
            ">", "?", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "!", "#", "@", "$", "%", "&", "*"};

    @Override
    public String processMessage(String text) {
        checkTags(text.toLowerCase());

        if (foundCount() == 1) {
            if (checkLastFound("привет"))
                return "Приветствую тебя, о мой повелитель!\nЧто желаешь? " + pass;
        }

        if (extract().length() == 0) {
            return "Есть два варианта паролей: Сложный пароль и простой пароль. Выберите подходящий для Вас!";
        } else {
            String password = "";
            if (checkLastFound("Сложный пароль")) {
                int length = randomNum(8, 12);
                String[] p = new String[length];

                for (int i = 0; i < length; i++) {
                    p[i] = data[randomNum(0, data.length)];
                }
                for (String s : p) {
                    password += s;
                }
            } else if (checkLastFound("Простой пароль")) {
                int length = randomNum(4, 4);
                String[] p = new String[length];

                for (int i = 0; i < length; i++) {
                    p[i] = data[randomNum(0, data.length)];
                }
                for (String s : p) {
                    password += s;
                }
            }
            return "Ваш пароль:\n" + password;
        }
    }

    public static void main(String[] args) {

        ApiContextInitializer.init();

        GeneratorPassword bot = new GeneratorPassword();
        bot.username = "JournalControljavaBot";
        bot.token = "958446677:AAHEOF-fqj1kgFLKJr8K3Lwu9US-17ey5os";

        bot.addTags("привет", "привет, здрасьте, здравствуй, добр, день, вечер, утро, hi, hello");

        bot.addTags("Сложный пароль", "сложный пароль, сложны пароль, сложн пароль, слож пароль, сло пароль, сл пароль");
        bot.addTags("Сложный пароль", "сложный, сложны, сложн, слож");
        bot.addTags("Простой пароль", "простой пароль, просто пароль, прост пароль, прос пароль, про пароль, пр пароль");
        bot.addTags("Простой пароль", "простой, просто, прост, прос");

        bot.start();
    }

    static private int randomNum(int min, int max) {
        Random r = new Random();
        return r.nextInt(max) + min;
    }
}

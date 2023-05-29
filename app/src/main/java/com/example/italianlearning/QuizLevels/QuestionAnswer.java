package com.example.italianlearning.QuizLevels;

public class QuestionAnswer {
    // вопросы для 10 уровня
    public static String question1[] = {
            "Как читается слово \"colore?\"",
            "Как читается слово \"cinema?\"",
            "Как читается слово \"greco?\"",
            "Как читается слово \"biglietto?\"",
            "Как переводится местоимения \"они\"",
            "Как переводится местоимения \"я\"",
            "Как переводится местоимения \"мы\"",
            "Как переводится слово\"essere\"",
            "Как переводится слово\"dare\"",
            "Как переводится слово\"capire\"",
            "Как переводится слово\"guardare\"",
            "Как переводится слово\"vedere\"",

    };
    // вопросы для 20 уровня
    public static String question2[] = {
            "Как переводится фраза \"Добрый вечер\"",
            "Как переводится слово \"спасибо\"",
            "Как переводится слово \"оранжевый\"",
            "Как переводится слово \"белый\"",
            "Как слово lavorare склоняется с местоимением \"я\"",
            "Как слово prendere склоняется с местоимением \"они\"",
            "Как слово partire склоняется с местоимением \"мы\"",
            "Как слово capire склоняется с местоимением \"Вы\"",
            "Как переводится слово \"Почему\"",
            "Как переводится число \"ноль\"",
            "Как переводится слово \"восемь\"",
            "Как переводится фраза \"Я не понимаю \"",
    };
    //Варианты ответов для 10 уровня

    public static String choises1[][] = {
            {"калоре","солоре","колорэ","саларэ"},
            {"чинема","синема","кинема","цинема"},
            {"кресо","гресо","крека","греко"},
            {"биглиэто","бильетто","биглиетта","бильета"},
            {"loro","io","lei","voi",},
            {"voi","loro","io","noi",},
            {"tu","noi","loro","lei",},
            {"купить","быть","хотеть","мочь",},
            {"отвечать","знать","есть","давать",},
            {"предлагать","объяснять","понимать","замечать",},
            {"смеяться","смотреть","читать","сидеть",},
            {"говорить","спорить","просить","видеть",},
    };
    //Варианты ответов для 20 уровня
    public static String choises2[][] = {
            {"Buona sera", "Ciao", "Boun giorno", "Salve "},
            {"Boun giorno", "Salve ", "grazie", "Ciao"},
            {"blu ", "arancione", "marrone ", "rosa "},
            {"nero", "rosa ", "arancione", "bianco"},
            {"io lavoriamo", "io lavoro", "io lavora", "io lavorano"},
            {"lei prendi", "lei prende", "lei prendo", "lei prendete"},
            {"noi partiamo", "noi parto", "noi partiete", "noi parti"},
            {"Voi capiisco", "Voi capisci", "Voi capiscono", "Voi capite"},
            {"perche", "dove", "come", "quando"},
            {"cinque", "uno ", "zero", "due"},
            {"dieci", "otto", "quattro", "tre "},
            {"Un tavolo per uno", "Un tavolo per uno", "Non capisco", "Mi sono perso"}
    };
    //правильные ответы для 10 уровня

    public static String correctAnswers1[] = {
            "колорэ",
            "чинема",
            "греко",
            "бильетто",
            "loro",
            "io",
            "noi",
            "быть",
            "давать",
            "понимать",
            "смотреть",
            "видеть",
    };
    //правильные ответы для 20 уровня
    public static String correctAnswers2[] = {
            "Buona sera",
            "grazie",
            "arancione",
            "bianco",
            "io lavoro",
            "lei prende",
            "noi partiamo",
            "Voi capite",
            "perche",
            "zero",
            "otto",
            "Non capisco",
    };
}

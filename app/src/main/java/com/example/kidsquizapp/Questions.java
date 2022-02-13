package com.example.kidsquizapp;

public class Questions {

    private String mQuestions[] = {

            "Guess the animal ?",
            "How many birds are in the picture  ?",
            "Which flag is this ?",
            "Count the number",
            "The tree has which color?",
            "How many colors are in the rainbow ?",
            "Guess the flower from the image ?",
            "Guess the color of sky ?",
            "Guess bird from the image ?",
            "How many number of Apple in the image"



    };

    private String mChoice[] []={
            {"Lion","Monkey","Cat","Tiger"},
            {"2","4","7","5"},
            {"USA","Algeria","Turkey","India"},
            {"2","8","9","5"},
            {"Green","Yellow","Blue","White"},
            {"5","8","7","6"},
            {"Lotus","Rose","Sunflower","Jasmine"},
            {"Blue","Purple","Green","Red"},
            {"Dove","Peacock","Qwl","parrot"},
            {"10","14","13","12"}


    };
    private  String mImages[] ={

            "q1",
            "q2",
            "q3a",
            "q4",
            "q5",
            "q6a",
            "q7",
            "q8",
            "q9",
            "q10"
    };

    private String mQuestionType[] ={

            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
    };

    private String mCorrectAnswer [] ={

            "Lion",
            "4",
            "India",
            "5",
            "Green",
            "7",
            "Rose",
            "Blue",
            "Peacock",
            "12"

    };

    public String getQuestions(int q) {
        String questions = mQuestions[q];
        return questions;
    }

    public String[]getChoice(int q) {
        String [] choice = mChoice[q];
        return choice;
    }

    public String getImages(int q) {
        String img = mImages[q];
        return img;
    }

    public String getType(int q) {
        String type = mQuestionType[q];
        return type;
    }

    public int getLength(){
        return  mQuestions.length;
    }

    public String getCorrectAnswer(int q) {
        String correct = mCorrectAnswer[q];
        return correct;
    }
}

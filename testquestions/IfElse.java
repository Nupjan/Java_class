package testquestions;

class IfElse {
    public static void main(String[] args) {
        int month = 3;
        String season;

        if (month == 12 || month == 1 || month == 2)
            season = "Summer";
        else if (month == 3 || month == 4 || month == 5)
            season = "Autumn";
        else if (month == 6 || month == 7 || month == 8)
            season = "Winter";
        else if (month == 9 || month == 10 || month == 11)
            season = "Spring";
        else
            season = "Bogus Month";
        System.out.println("In Melbourne, March is in the" + season + ".");
    }
}
package testquestions;

class SwitchProgram {
    public static void main(String args[]) {
        int month = 3;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Summer";
                break;
            case 3:
            case 4:
            case 5:
                season = "Autumn";
                break;
            case 6:
            case 7:
            case 8:
                season = "Winter";
                break;
            case 9:
            case 10:
            case 11:
                season = "Spring";
                break;
            default:

                season = "Bogus Month";
        }
        System.out.println("In Melbourne, March is in the " + season + ".");
    }
}
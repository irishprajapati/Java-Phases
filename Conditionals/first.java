class Data{
    public static void main(String[] args) {
        int score = 82;
        String grade;
        if (score>=90){
            grade = "A";
        }else if (score>=75){
            grade = "B";
        }else if (score >=60){
            grade = "C";
        }else{
            grade = "Fail";
        }
        System.out.println(grade);
    }
}


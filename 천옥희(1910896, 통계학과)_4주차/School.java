class School {
    Teacher yiyoon;
    Student ohcheon;
    Members kim, song, choi;
    Members Yong, lee, cheon;
    Members students[];
    Members Teacher[];
    
    public School(){
        yiyoon = new Teacher("Yoon", "M103013", "IT 공학전공");
        kim = new Members("kim", "IT200324");
        song = new Members("song", "IT190324");
        choi = new Members("choi", "IT180324");
        Yong = new Members("Young", "M103013");
        lee = new Members("lee", "M103082");
        cheon = new Members("cheon", "M134532");
        ohcheon = new Student("Cheon", "IT191089", "IT 공학전공");

        students = new Members[4];
        students[0] = yiyoon;
        students[1] = kim;
        students[2] = song;
        students[3] = choi;
        
        Teacher = new Members[4];
        Teacher[0] = ohcheon;
        Teacher[1] = Yong;
        Teacher[2] = lee;
        Teacher[3] = cheon;
    }

    public void makeWork() {
        int n = students.length;
        for(int i=0; i < n; i++){
            students[i].work();
        }
        int m = Teacher.length;
        for(int i=0; i < m; i++){
            Teacher[i].run();
        }
    }

    public static void main(String args[]){
        School mycom = new School();
        mycom.makeWork();
    }
}

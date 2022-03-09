class Student extends Members {
    String dept;
    
    public Student (String name, String idnum, String dept){
        super(name, idnum);
        this.dept = dept;
    }
    
    public void run(){
        System.out.println("Student: \"" + name + 
        "\" studies hard with his teachers in " + dept + " dept." );
    }
}

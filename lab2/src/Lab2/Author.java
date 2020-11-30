package Lab2;

public class Author {
    private String name;
    private String email;
    private String gender;
    public void Author(){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Gender: "+gender);
    }
    public void getName(String name){
        this.name=name;
    }
    public void geMail(String email){
        this.email=email;
    }
    public String setMail(){
        return email;
    }
    public void getGender(String gender){
        this.gender = gender;
    }
}

public class Author {
    String name;
    String email;
    char gender;
    public Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public char getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", gender=" + gender + '}';
    }
    public static void main(String[] args) {
        Author author=new Author("Hoang Minh Hieu","noblehhmh@gmail.com",'M');
        System.out.println("TestAuthor: "+author);
        author.setEmail("29.10.2003");
        System.out.println("New email: "+author.getEmail());
    }
}

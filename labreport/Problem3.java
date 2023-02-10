package labreport;
public class Problem3 {
        String name;
        int id;
        String sec;
       Problem3() {
            System.out.println("inside default constructor");
        }
        Problem3(String name, int id, String sec) {
            this.name = name;
            this.id = id;
            this.sec = sec;
            System.out.println("name = " + name);
            System.out.println("id = " + id);
            System.out.println("sec = " + sec);
        }
    
    public static void main(String[] args) {
     Problem3 i = new Problem3();
     Problem3 st1 = new Problem3("student1",24,"D");
    }
}

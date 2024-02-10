public class User {
    public String ID;
    public String Username;
    public String Password;
    public String Fullname;

    public User()
    {
        this.ID = "";
        this.Username = "";
        this.Password = "";
        this.Fullname = "";
    }

    public User(String ID, String Username, String Password, String Fullname)
    {
        this.ID = ID;
        this.Username = Username;
        this.Password = Password;
        this.Fullname = Fullname;
    }
}

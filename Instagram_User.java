public class Instagram_User {
    public String ID;
    public String UserID;
    public String User_Type;
    public String Username;
    public String Fullname;
    public String Bio;
    public int Folowers_Count;
    public int Folowing_Count;
    public int Post_Count;

    public Instagram_User()
    {
        this.ID = "";
        this.UserID = "";
        this.User_Type = "";
        this.Username = "";
        this.Fullname = "";
        this.Bio = "";
        this.Folowers_Count = 0;
        this.Folowing_Count = 0;
        this.Post_Count = 0;
    }

    public Instagram_User(String ID, String UserID, String User_Type, String Username, String Fullname, String Bio, int Folowers_Count, int Folowing_Count, int Post_Count)
    {
        this.ID = ID;
        this.UserID = UserID;
        this.User_Type = User_Type;
        this.Username = Username;
        this.Fullname = Fullname;
        this.Bio = Bio;
        this.Folowers_Count = Folowers_Count;
        this.Folowing_Count = Folowing_Count;
        this.Post_Count = Post_Count;
    }
}

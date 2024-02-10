public class Post {
    public String ID;
    public String Post_ID;
    public String Name;
    public String Caption;
    public int Likes;

    public Post()
    {
        this.ID = "";
        this.Post_ID = "";
        this.Name = "";
        this.Caption = "";
        this.Likes = 0;
    }

    public Post(String ID, String Post_ID, String Name, String Caption, int Likes)
    {
        this.ID = ID;
        this.Post_ID = Post_ID;
        this.Name = Name;
        this.Caption = Caption;
        this.Likes = Likes;
    }
}

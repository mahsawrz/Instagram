public class PageInfo {
    public String ID;
    public String Bio;
    public int Folowers_Count;
    public int Folowing_Count;
    public int Post_Count;

    public PageInfo()
    {
        this.ID = "";
        this.Bio = "";
        this.Folowers_Count = 0;
        this.Folowing_Count = 0;
        this.Post_Count = 0;
    }

    public PageInfo(String ID, String Bio, int Folowers_Count, int Folowing_Count, int Post_Count)
    {
        this.ID = ID;
        this.Bio = Bio;
        this.Folowers_Count = Folowers_Count;
        this.Folowing_Count = Folowing_Count;
        this.Post_Count = Post_Count;
    }
}

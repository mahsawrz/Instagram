import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ShowPages {
    //  1) This Method displays the user's page information ******************************************************************************************
    public static void show_PageInfo(User user, List<PageInfo> pageInfos)
    {
        Scanner input = new Scanner(System.in);
        for(PageInfo pageInfo : pageInfos)
        {
            if (pageInfo.ID.equals(user.ID))
            {
                System.out.println("*******  " + user.Fullname +"'s Page Info  *******");
                System.out.println("Your Bio :  " + pageInfo.Bio);
                System.out.println("Your Followers Count :  " + pageInfo.Folowers_Count);
                System.out.println("Your Followings Count :  " + pageInfo.Folowing_Count);
                System.out.println("Your Posts Count :  " + pageInfo.Post_Count);
                break;
            }
        }
    }
    //  2) This method displays the information of page post*****************************************************************************************
    public static void show_PagePosts(String userID, String fullName, List<Post> posts, boolean can_add)
    {
        Scanner input = new Scanner(System.in);
        loop: while (true)
        {
            System.out.println("*******  " + fullName +"'s captions and ids  *******");
            for(Post post : posts)
            {
                if (post.ID.equals(userID))
                {
                    System.out.println(post.Name);
                    System.out.println("   Caption :  " + post.Caption);
                    System.out.println("   ID :  " + post.Post_ID);
                }
            }
            System.out.println("\n");
            System.out.println("*******  Selection list of posts  *******");
            System.out.println("Enter post id to show post");
            if (can_add)
            System.out.println("Enter 1 to add new post");
            System.out.println("Enter 0 to exit post selection");
            System.out.print("> ");
            String choose = input.nextLine();
            switch (choose)
            {
                case "1":
                    if (can_add)
                    {
                        System.out.print("\n\n");
                        System.out.println("*******  Add Post  *******");
                        System.out.print("Post ID : ");
                        String p_ID = input.nextLine();
                        System.out.print("Post Name : ");
                        String p_Name = input.nextLine();
                        System.out.print("Post Caption : ");
                        String p_Caption = input.nextLine();
                        InstaTest.posts.add(new Post(userID, p_ID, p_Name, p_Caption, 0));
                        System.out.print("\n\n");
                    }
                    else
                    {
                        System.out.print(">>> Please enter a valid post id.");
                        Scanner sc = new Scanner(System.in);
                        sc.nextLine();
                        System.out.print("\n\n");
                    }
                    break;
                case "0":
                    break loop;
                default:
                    post_loop: while (true)
                    {
                        boolean found = false;
                        Post tmp_post = new Post();
                        int tmp_post_index = -1;
                        for(Post post : posts)
                        {
                            tmp_post_index++;
                            if (post.Post_ID.equals(choose) && post.ID.equals(userID))
                            {
                                System.out.print("\n\n");
                                System.out.println("*******  Post Info  *******");
                                System.out.println(post.Name);
                                System.out.println("   Caption :  " + post.Caption);
                                System.out.println("   ID :  " + post.Post_ID);
                                System.out.println("   Likes :  " + post.Likes);
                                tmp_post = post;
                                found = true;
                                break;
                            }
                        }
                        if (!found)
                        {
                            System.out.print(">>> Please enter a valid post id.");
                            Scanner sc = new Scanner(System.in);
                            sc.nextLine();
                            break post_loop;
                        }
                        else
                        {
                            System.out.println("\n");
                            System.out.println("*******  Selection list for post  *******");
                            System.out.println("Enter L to like post");
                            System.out.println("Press any key to back");
                            System.out.print("> ");
                            String choose_post = input.nextLine();
                            if (choose_post.equals("L"))
                            {
                                tmp_post.Likes += 1;
                                posts.set(tmp_post_index, tmp_post);
                            }
                            else
                            {
                                System.out.print("\n\n");
                                break post_loop;
                            }
                        }
                    }
                    break;
            }
        }
    }
    //  3) This method Shows Following Page********************************************************************************************************************
    public static void show_PageFollowing(String userID, String fullName, List<Instagram_User> instagram_users)
    {
        Scanner input = new Scanner(System.in);
        loop: while (true)
        {
            System.out.println("*******  " + fullName +"'s following UserNames  *******");
            List<String> tmp_usersids = new ArrayList<String>();
            for(Instagram_User instagram_user : instagram_users)
            {
                if (instagram_user.ID.equals(userID) && instagram_user.User_Type.equals("following"))
                {
                    System.out.println(instagram_user.Fullname + "  , UserID : " + instagram_user.UserID);
                    tmp_usersids.add(instagram_user.UserID);
                }
            }
            System.out.println("\n");
            System.out.println("*******  Selection list of following  *******");
            System.out.println("Enter following UserID to open it");
            System.out.println("Enter 1 to add new following");
            System.out.println("Enter 0 to exit Selection list of following");
            System.out.print("> ");
            String choose = input.nextLine();
            switch (choose)
            {
                case "1":
                    add_loop: while (true)
                    {
                        List<Instagram_User> refreshed_instagram_users = new ArrayList<Instagram_User>();
                        for(Instagram_User instagram_user : instagram_users)
                        {
                            if (!(instagram_user.ID.equals(userID) && instagram_user.User_Type.equals("following")))
                            {
                                boolean tmp_can_add = true;

                                for (String _usersid_ : tmp_usersids)
                                    if (instagram_user.UserID.equals(_usersid_))
                                    {
                                        tmp_can_add = false;
                                        break;
                                    }

                                if (tmp_can_add)
                                    refreshed_instagram_users.add(instagram_user);
                            }
                        }
                        System.out.println("\n\n");
                        System.out.println("*******  All Users that you can add  *******");
                        for(Instagram_User instagram_user : refreshed_instagram_users)
                        {
                            System.out.println(instagram_user.Fullname + " , UserID : " + instagram_user.UserID);
                        }
                        System.out.println("\n");
                        System.out.println("*******  Selection list of add following  *******");
                        System.out.println("Enter UserID to follow");
                        System.out.println("Enter 0 to exit Selection list of add following");
                        System.out.print("> ");
                        String user_choose = input.nextLine();
                        switch (user_choose)
                        {
                            case "0":
                                break add_loop;
                            default:
                                Instagram_User tmp_instagram_user = new Instagram_User();
                                boolean found = false;
                                for(Instagram_User instagram_user : refreshed_instagram_users)
                                {
                                    if (instagram_user.UserID.equals(user_choose))
                                    {
                                        tmp_instagram_user = instagram_user;
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found)
                                {
                                    System.out.print(">>> Please enter a valid UserID.");
                                    System.out.print("\nPress any key ... ");
                                    Scanner sc = new Scanner(System.in);
                                    sc.nextLine();
                                }
                                else
                                {
                                    InstaTest.instagram_users.add(new Instagram_User(userID, tmp_instagram_user.UserID,
                                            "following", tmp_instagram_user.Username, tmp_instagram_user.Fullname,
                                            tmp_instagram_user.Bio, tmp_instagram_user.Folowers_Count,
                                            tmp_instagram_user.Folowing_Count, tmp_instagram_user.Post_Count));
                                            instagram_users = InstaTest.instagram_users;
                                            tmp_usersids.add(tmp_instagram_user.UserID);
                                        }
                                break;
                        }
                    }
                    System.out.print("\n\n");
                    break;
                case "0":
                    break loop;
                default:
                    post_loop: while (true) {
                        boolean found = false;
                        String found_ID = "-1";
                        String found_FullName = "";
                        for (Instagram_User instagram_user : instagram_users) {
                            if (instagram_user.ID.equals(userID) &&
                                    instagram_user.UserID.equals(choose) &&
                                    instagram_user.User_Type.equals("following")) {
                                found_ID = instagram_user.UserID;
                                found_FullName = instagram_user.Fullname;
                                System.out.print("\n\n");
                                System.out.println("*******  User info of following  *******");
                                System.out.println("User Name :  " + instagram_user.Username);
                                System.out.println("Full Name :  " + instagram_user.Fullname);
                                System.out.println("Bio :  " + instagram_user.Bio);
                                System.out.println("Followers Count :  " + instagram_user.Folowers_Count);
                                System.out.println("Followings Count :  " + instagram_user.Folowing_Count);
                                System.out.println("Posts Count :  " + instagram_user.Post_Count);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.print(">>> Please enter a valid UserID.");
                            System.out.print("\nPress any key ... ");
                            Scanner sc = new Scanner(System.in);
                            sc.nextLine();
                            System.out.print("\n\n");
                            break post_loop;
                        } else {
                            System.out.println("\n");
                            System.out.println("*******  Selection list for posts  *******");
                            System.out.println("Enter 1 to show page posts");
                            System.out.println("Enter 0 to exit Selection list for posts");
                            System.out.print("> ");
                            String choose_post = input.nextLine();
                            switch (choose_post) {
                                case "1":
                                    System.out.print("\n\n");
                                    ShowPages.show_PagePosts(found_ID, found_FullName, InstaTest.posts, false);
                                    break;
                                case "0":
                                    System.out.print("\n\n");
                                    break post_loop;
                                default:
                                    System.out.print(">>> Please enter a valid choice number.");
                                    System.out.print("\nPress any key ...");
                                    Scanner sc = new Scanner(System.in);
                                    sc.nextLine();
                                    System.out.print("\n\n");
                                    break;
                            }
                        }
                    }
                    break;
            }
        }
    }
    //  4) This method Shows Follower Page************************************************************************************************************
    public static void show_PageFollower(String userID, String fullName, List<Instagram_User> instagram_users)
    {
        Scanner input = new Scanner(System.in);
        loop: while (true)
        {
            System.out.println("*******  " + fullName +"'s follower UserNames  *******");
            for(Instagram_User instagram_user : instagram_users)
            {
                if (instagram_user.ID.equals(userID) && instagram_user.User_Type.equals("follower"))
                {
                    System.out.println(instagram_user.Fullname + " , UserID : " + instagram_user.UserID);
                }
            }
            System.out.println("\n");
            System.out.println("*******  Selection list of follower  *******");
            System.out.println("Enter follower UserID to open it");
            System.out.println("Enter 0 to exit Selection list of follower");
            System.out.print("> ");
            String choose = input.nextLine();
            switch (choose)
            {
                case "0":
                    break loop;
                default:
                    post_loop: while (true)
                    {
                        boolean found = false;
                        String found_ID = "-1";
                        String found_FullName = "";
                        for(Instagram_User instagram_user : instagram_users)
                        {
                            if (instagram_user.ID.equals(userID) && instagram_user.UserID.equals(choose) && instagram_user.User_Type.equals("follower") )
                            {
                                found_ID = instagram_user.UserID;
                                found_FullName = instagram_user.Fullname;
                                System.out.print("\n\n");
                                System.out.println("*******  User info of follower  *******");
                                System.out.println("User Name :  " + instagram_user.Username);
                                System.out.println("Full Name :  " + instagram_user.Fullname);
                                System.out.println("Bio :  " + instagram_user.Bio);
                                System.out.println("Followers Count :  " + instagram_user.Folowers_Count);
                                System.out.println("Followings Count :  " + instagram_user.Folowing_Count);
                                System.out.println("Posts Count :  " + instagram_user.Post_Count);
                                found = true;
                                break;
                            }
                        }
                        if (!found)
                        {
                            System.out.print(">>> Please enter a valid UserID.");
                            Scanner sc = new Scanner(System.in);
                            sc.nextLine();
                            System.out.print("\n\n");
                            break post_loop;
                        }
                        else
                        {
                            System.out.println("\n");
                            System.out.println("*******  Selection list for posts  *******");
                            System.out.println("Enter 1 to show page posts");
                            System.out.println("Enter 0 to exit Selection list for posts");
                            System.out.print("> ");
                            String choose_post = input.nextLine();
                            switch (choose_post)
                            {
                                case "1":
                                    System.out.print("\n\n");
                                    ShowPages.show_PagePosts(found_ID, found_FullName, InstaTest.posts, false);
                                    break;
                                case "0":
                                    System.out.print("\n\n");
                                    break post_loop;
                                default:
                                    System.out.print(">>> Please enter a valid choice number.");
                                    Scanner sc = new Scanner(System.in);
                                    sc.nextLine();
                                    System.out.print("\n\n");
                                    break;
                            }
                        }
                    }

                    break;
            }
        }
    }
}

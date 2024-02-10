import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstaTest {
    public static List<User> users = new ArrayList<User>();
    public static List<PageInfo> pageInfos = new ArrayList<PageInfo>();
    public static List<Post> posts = new ArrayList<Post>();
    public static List<Instagram_User> instagram_users = new ArrayList<Instagram_User>();
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        User found_user = new User();
        String user_name, password;
        users = Methodes.add_Users();
        pageInfos = Methodes.add_PageInfos();
        posts = Methodes.add_Posts();
        instagram_users = Methodes.add_Instagram_Users();
        first_loop: while (true)
        {
            System.out.println("*** Welcome to Instagram ***");
            System.out.print("Enter your username : ");
            user_name = input.nextLine();
            System.out.print("Enter your password : ");
            password = input.nextLine();
            found_user = Methodes.find_user(users, user_name, password);
            if (found_user.ID.equals("-1"))
            {
                System.out.println(">>> Please enter a valid username and password.\n");
                continue first_loop;
            }
            else
            {
                main_choose_loop: while (true)
                {
                    System.out.print("\n");
                    System.out.println("Dear " + found_user.Fullname + ", please choose.");
                    System.out.println("*******  Selection List  *******");
                    System.out.println("Enter 1 to show page info");
                    System.out.println("Enter 2 to show page posts");
                    System.out.println("Enter 3 to show page following");
                    System.out.println("Enter 4 to show page followers");
                    System.out.println("Enter 0 to quit");
                    System.out.print("> ");
                    String choose = input.nextLine();
                    switch (choose)
                    {
                        case "1":
                            System.out.print("\n");
                            ShowPages.show_PageInfo(found_user, pageInfos);
                            break;
                        case "2":
                            System.out.print("\n");
                            ShowPages.show_PagePosts(found_user.ID, found_user.Fullname, posts, true);
                            break;
                        case "3":
                            System.out.print("\n");
                            ShowPages.show_PageFollowing(found_user.ID, found_user.Fullname, instagram_users);
                            break;
                        case "4":
                            System.out.print("\n");
                            ShowPages.show_PageFollower(found_user.ID, found_user.Fullname, instagram_users);
                            break;
                        case "0":
                            System.out.print("\n");
                            continue first_loop;
                        default:
                            System.out.println("\n>>> Please enter a correct number.");
                            break;
                    }
                }
            }
        }
    }
}
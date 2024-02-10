import java.util.ArrayList;
import java.util.List;
public class Methodes {
//********User information is added and stored in this method********************************************************************************************
    public static List<User> add_Users()
    {
        List<User> users = new ArrayList<User>();
        users.add(new User("1","mina","1234567", "Mina Noori"));
        users.add(new User("2","mahnaz","9830100", "Mahnaz Razeqi"));
        users.add(new User("3","mahsa","9830593", "Mahsa Rezaei"));
        users.add(new User("4","mahdi","9830689", "Mahdi Rezaei"));
        users.add(new User("5","nafas","9812702", "Nafas Nobakht"));
        users.add(new User("6","nastaran","7879120", "Nastaran Nabavi"));
        users.add(new User("7","azita","1729500", "Azita Layeqi"));
        users.add(new User("8","yalda","3329260", "Yalda Keyvani"));
        users.add(new User("9","tina","9831264", "Tina Hadi"));
        users.add(new User("10","atefeh","9977001", "Atefeh Bahrami"));
        return users;
    }
//*******User page information is added and stored in this method******************************************************************************************
    public static List<PageInfo> add_PageInfos()
    {
        List<PageInfo> pageInfos = new ArrayList<PageInfo>();
        pageInfos.add(new PageInfo("1","Be Valuable Not Available!!",2, 2, 2));
        pageInfos.add(new PageInfo("2","life is short, so keep smiling Always :)",2, 2, 3));
        pageInfos.add(new PageInfo("3","extraordinarily, passionately, in love with suffering",2, 2, 3));
        pageInfos.add(new PageInfo("4","Life is a question and how we live it is our answer.",2, 2, 2));
        pageInfos.add(new PageInfo("5","Courage is Knowing What not to fear.",2, 2, 3));
        pageInfos.add(new PageInfo("6","Trust in dreams.for in them is hidden the gate to eternity.",2, 2, 2));
        pageInfos.add(new PageInfo("7","A beautiful life begins with a beautiful mind.",2, 2, 2));
        pageInfos.add(new PageInfo("8", "Dont forget:beautiful Sunsets need cloudy skies.",2, 2, 2));
        pageInfos.add(new PageInfo("9","Be a good person but dont waste time to prove it.",2, 2, 2));
        pageInfos.add(new PageInfo("10","Let your smile change the world ,but dont let the World change your smile.",2, 2, 2));
        return pageInfos;
    }
//**********post information is added and stored in this method*****************************************************************************************
    public static List<Post> add_Posts()
    {
        //<<User post information>>//
        List<Post> posts = new ArrayList<Post>();
        posts.add(new Post("1", "101", "Post 1", "I feel like making dreams come true.", 10));
        posts.add(new Post("1", "102", "Post 2",  "Stay positive. Attitude is everything.", 20));
        posts.add(new Post("2", "201", "Post 1", "Escape the ordinary.", 10));
        posts.add(new Post("2", "202", "Post 2", "No friendship is never accident.", 20));
        posts.add(new Post("2", "203", "Post 3", "No man is a failure who is enjoying life.", 23));
        posts.add(new Post("3", "301", "Post 1", "No man is a failure who is enjoying life.", 3));
        posts.add(new Post("3", "302", "Post 2", "Escape the ordinary.", 13));
        posts.add(new Post("3", "303", "Post 3", "When nothing goes right, go left.", 10));
        posts.add(new Post("4", "401", "Post 1", "When nothing goes right, go left.", 10));
        posts.add(new Post("4", "402", "Post 2", "No friendship is never accident.", 20));
        posts.add(new Post("5", "501", "Post 1", "All we have is now.", 10));
        posts.add(new Post("5", "502", "Post 2",  "Stay positive. Attitude is everything.", 5));
        posts.add(new Post("5", "503", "Post 3", "Escape the ordinary.", 15));
        posts.add(new Post("6", "601", "Post 1", "When nothing goes right, go left.", 10));
        posts.add(new Post("6", "602", "Post 2",  "Stay positive. Attitude is everything.", 20));
        posts.add(new Post("7", "701", "Post 1",  "Do not give up because it got hard.", 10));
        posts.add(new Post("7", "702", "Post 2", "All we have is now.", 20));
        posts.add(new Post("8", "801", "Post 1",  "Stay positive. Attitude is everything.", 10));
        posts.add(new Post("8", "802", "Post 2", "Be self-starter.", 20));
        posts.add(new Post("9", "901", "Post 1", "All we have is now.", 10));
        posts.add(new Post("9", "902", "Post 2",  "Do not give up because it got hard.", 20));
        posts.add(new Post("10", "1001", "Post 1", "Be self-starter.", 10));
        posts.add(new Post("10", "1002", "Post 2",  "Stay positive. Attitude is everything.", 20));

        //<<Following and Followers post information>>//
        posts.add(new Post("11", "101", "Post 1", "For me it doesnt feel like you", 410));
        posts.add(new Post("11", "102", "Post 2", "This too shall pass", 420));
        posts.add(new Post("12", "101", "Post 1", "My life is what im fighting for", 410));
        posts.add(new Post("12", "102", "Post 2", "Paffinity is neither crime nor pain...Its death ", 420));
        posts.add(new Post("13", "101", "Post 1", "Dont tell people your dreams.Show them.", 510));
        posts.add(new Post("13", "102", "Post 2", "You dont know how lovely you are", 520));
        posts.add(new Post("13", "103", "Post 3", "Learn to wait theres always time for everything", 530));
        posts.add(new Post("14", "101", "Post 1", "All you need is to believe in yourself", 510));
        posts.add(new Post("14", "102", "Post 2", "Take the journey even If It means alone", 520));
        posts.add(new Post("14", "103", "Post 3", "Beauty is not in the face Its light in the heart.", 530));
        posts.add(new Post("15", "101", "Post 1", "I know I will be someone someday", 410));
        posts.add(new Post("15", "102", "Post 2", "Sun will rise and we will try again", 420));
        posts.add(new Post("16", "101", "Post 1", "I can and I will. Watch me!", 410));
        posts.add(new Post("16", "102", "Post 2", "If tomarrow brings new hope,I hope it brings you.", 420));
        posts.add(new Post("17", "101", "Post 1", "Nothing hurts more than late night tears", 510));
        posts.add(new Post("17", "102", "Post 2", "I've got sunshine on a cloudy day.", 520));
        posts.add(new Post("17", "103", "Post 3", "We all have a story we will never tell", 530));
        posts.add(new Post("18", "101", "Post 1", "Shoes or people if they hurt you,they are not your size!!", 410));
        posts.add(new Post("18", "102", "Post 2", "He wants you !Any excuse to Stay...", 420));
        posts.add(new Post("19", "101", "Post 1", "Live for ourselves not for showing that to others ", 410));
        posts.add(new Post("19", "102", "Post 2", "You are nothing short of my everything", 420));
        posts.add(new Post("20", "101", "Post 1", "We miss someone Who we shouldnt miss", 410));
        posts.add(new Post("20", "102", "Post 2", "The best thing about me is you", 420));
        posts.add(new Post("21", "101", "Post 1", "Dont judge a situation you've never been in", 410));
        posts.add(new Post("21", "102", "Post 2", "Dont worry!you and I have each other", 420));
        posts.add(new Post("22", "101", "Post 1", "For me it doesnt feel like you", 410));
        posts.add(new Post("22", "102", "Post 2", "I can and I will. Watch me!", 420));
        posts.add(new Post("23", "101", "Post 1", "All you need is to believe in yourself", 410));
        posts.add(new Post("24", "101", "Post 1", "learn to wait theres always time for everything", 410));
        posts.add(new Post("24", "102", "Post 2", "This too shall pass", 420));
        posts.add(new Post("25", "101", "Post 1", "My life is what im fighting for", 410));
        posts.add(new Post("25", "102", "Post 2", "A beautiful life begins with a beautiful mind.", 420));
        posts.add(new Post("26", "101", "Post 1", "Dont forget:beautiful Sunsets need cloudy skies.", 410));
        posts.add(new Post("26", "102", "Post 2", "No man is a failure who is enjoying life.", 420));
        posts.add(new Post("27", "101", "Post 1", "Be a good person but dont waste time to prove it.", 410));
        posts.add(new Post("27", "102", "Post 2", "Courage is Knowing What not to fear.", 420));
        posts.add(new Post("28", "101", "Post 1", "For me it doesnt feel like you", 410));
        posts.add(new Post("28", "102", "Post 2", "Paffinity is neither crime nor pain...Its death ", 420));
        posts.add(new Post("29", "101", "Post 1", "All you need is to believe in yourself", 410));
        posts.add(new Post("29", "102", "Post 2", "Sun will rise and we will try again", 420));
        posts.add(new Post("30", "101", "Post 1", "Know yourself!Understand yourself!Correct yourself...", 410));
        posts.add(new Post("30", "102", "Post 2", "If tomarrow brings new hope,I hope it brings you.", 420));
        posts.add(new Post("31", "101", "Post 1", "For me it doesnt feel like you", 410));
        posts.add(new Post("31", "102", "Post 2", "Live for ourselves not for showing that to others ", 420));
        posts.add(new Post("31", "103", "Post 3", "Shoes or people if they hurt you,they are not your size!!", 410));
        posts.add(new Post("32", "101", "Post 1", "Let your smile change the world ,but dont let the World change your smile.", 420));
        posts.add(new Post("32", "102", "Post 2", "All you need is to believe in yourself", 410));
        posts.add(new Post("32", "103", "Post 3", "My life is what im fighting for", 420));
        posts.add(new Post("33", "101", "Post 1", "Shoes or people if they hurt you,they are not your size!!", 410));
        posts.add(new Post("33", "102", "Post 2", "Paffinity is neither crime nor pain...Its death ", 420));
        posts.add(new Post("34", "101", "Post 1", "If tomarrow brings new hope,I hope it brings you.", 410));
        posts.add(new Post("34", "102", "Post 2", "Sun will rise and we will try again", 420));
        posts.add(new Post("35", "101", "Post 1", "Dont judge a situation you've never been in", 410));
        posts.add(new Post("35", "102", "Post 2", "Life is a question and how we live it is our answer.", 420));
        posts.add(new Post("36", "101", "Post 1", "Live for ourselves not for showing that to others ", 410));
        posts.add(new Post("36", "102", "Post 2", "All you need is to believe in yourself", 420));
        posts.add(new Post("36", "103", "Post 3", "For me it doesnt feel like you", 410));
        posts.add(new Post("37", "101", "Post 1", "Dont forget:beautiful Sunsets need cloudy skies.", 420));
        posts.add(new Post("37", "102", "Post 2", "Shoes or people if they hurt you,they are not your size!!", 410));
        posts.add(new Post("37", "103", "Post 3", "Life is a question and how we live it is our answer.", 420));
        posts.add(new Post("37", "104", "Post 4", "Let your smile change the world ,but dont let the World change your smile.", 410));
        posts.add(new Post("38", "101", "Post 1", "Know yourself!Understand yourself!Correct yourself...", 420));
        posts.add(new Post("38", "102", "Post 2", "Take the journey even If It means alone", 410));
        posts.add(new Post("38", "103", "Post 3", "We all have a story we will never tell", 420));
        posts.add(new Post("39", "101", "Post 1", "My life is what im fighting for", 410));
        posts.add(new Post("39", "102", "Post 2", "If tomarrow brings new hope,I hope it brings you.", 420));
        posts.add(new Post("40", "101", "Post 1", "Sun will rise and we will try again", 410));
        posts.add(new Post("40", "102", "Post 2", "Dont judge a situation you've never been in", 420));
        posts.add(new Post("41", "101", "Post 1", "We all have a story we will never tell", 410));
        posts.add(new Post("41", "102", "Post 2", "I can and I will. Watch me!", 420));
        posts.add(new Post("42", "101", "Post 1", "Life is a question and how we live it is our answer.", 410));
        posts.add(new Post("42", "102", "Post 2", "Dont forget:beautiful Sunsets need cloudy skies.", 420));
        posts.add(new Post("43", "101", "Post 1", "My life is what im fighting for", 410));
        posts.add(new Post("43", "102", "Post 2", "Courage is Knowing What not to fear.", 420));
        posts.add(new Post("43", "103", "Post 3", "Paffinity is neither crime nor pain...Its death ", 410));
        posts.add(new Post("44", "101", "Post 1", "Take the journey even If It means alone", 420));
        posts.add(new Post("44", "102", "Post 2", "If tomarrow brings new hope,I hope it brings you.", 410));
        posts.add(new Post("45", "101", "Post 1", "Live for ourselves not for showing that to others ", 420));
        posts.add(new Post("45", "102", "Post 2", "Shoes or people if they hurt you,they are not your size!!", 410));
        posts.add(new Post("46", "101", "Post 1", "Know yourself!Understand yourself!Correct yourself...", 420));
        posts.add(new Post("47", "101", "Post 1", "Take the journey even If It means alone", 410));
        posts.add(new Post("47", "102", "Post 2", "We all have a story we will never tell", 420));
        posts.add(new Post("48", "101", "Post 1", "All you need is to believe in yourself", 410));
        posts.add(new Post("48", "102", "Post 2", "Courage is Knowing What not to fear.", 420));
        posts.add(new Post("49", "101", "Post 1", "Dont forget:beautiful Sunsets need cloudy skies.", 410));
        posts.add(new Post("49", "102", "Post 2", "For me it doesnt feel like you", 420));
        posts.add(new Post("49", "103", "Post 3", "Live for ourselves not for showing that to others ", 410));
        posts.add(new Post("50", "101", "Post 1", "Sun will rise and we will try again", 420));
        posts.add(new Post("50", "102", "Post 2", "We all have a story we will never tell", 410));
        posts.add(new Post("51", "101", "Post 1", "Paffinity is neither crime nor pain...Its death ", 420));
        posts.add(new Post("51", "102", "Post 2", "Let your smile change the world ,but dont let the World change your smile.", 410));
        posts.add(new Post("52", "101", "Post 1", "Know yourself!Understand yourself!Correct yourself...", 420));
        posts.add(new Post("52", "102", "Post 2", "Courage is Knowing What not to fear.", 410));
        posts.add(new Post("52", "103", "Post 3", "Life is a question and how we live it is our answer.", 420));
        return posts;
    }
//*********Dedicated user post information is added and stored in this method******************************************************************************
    public static List<Instagram_User> add_Instagram_Users()
    {
        List<Instagram_User> instagram_users = new ArrayList<Instagram_User>();
        instagram_users.add(new Instagram_User("1", "11", "following", "ali", "Ali Hosseini",
                "If you cant be kind,be quiet",1, 11, 111));
        instagram_users.add(new Instagram_User("1", "12", "follower", "mina", "Mina Darabi",
                "Silence is the most powerful scream",2, 22, 222));
        instagram_users.add(new Instagram_User("1", "13", "following", "melika", "Melika Rahmani",
                "Prove yourself to yourself not others",3, 33, 333));
        instagram_users.add(new Instagram_User("1", "14", "follower", "sina", "Sina Bagheri",
                "Desire makes the impossible,possible",4, 44, 444));
        instagram_users.add(new Instagram_User("2", "15", "following", "elnaz", "Elnaz Mohamadi",
                "Life is short appreciate each day like it was your last",5, 55, 555));
        instagram_users.add(new Instagram_User("2", "16", "follower", "maryam", "Maryam Diba",
                "For every negative there is a positive",6, 66, 666));
        instagram_users.add(new Instagram_User("2", "17", "following", "karim", "Karim Bahadori",
                "Forgiving someone is easy,trusting them again not! ",7, 77, 777));
        instagram_users.add(new Instagram_User("2", "18", "follower", "somaye", "Somaye Amini",
                "I will win,not immediately but definitely",8, 88, 888));
        instagram_users.add(new Instagram_User("2", "19", "following", "mansoor", "Mansoor Kiani",
                "Silence is the most powerful scream",9, 99, 999));
        instagram_users.add(new Instagram_User("2", "20", "follower", "amir", "Amir Khodabakhshi",
                "If you cant be kind,be quiet",10, 1010, 101010));
        instagram_users.add(new Instagram_User("3", "21", "following", "katayoon", "Katayoon Ramezani",
                "In a world where you can be anyone,be yourself",11, 1111, 111111));
        instagram_users.add(new Instagram_User("3", "22", "follower", "mohsen", "Mohsen Ramezani",
                "Success is in my veins",12, 1212, 121212));
        instagram_users.add(new Instagram_User("3", "23", "following", "farid", "Farid Farhadi",
                "Welcome to my world",13, 1313, 131313));
        instagram_users.add(new Instagram_User("3", "24", "follower", "soheyla", "Soheyla Nazi",
                "Simplicity is the key to happiness",14, 1414, 141414));
        instagram_users.add(new Instagram_User("4", "25", "following", "farzad", "Farzad Ahmadian",
                "In a world of Worriers,be the Warrior",15, 1515, 151515));
        instagram_users.add(new Instagram_User("4", "26", "follower", "rasool", "Rasool Nikoo",
                "Happiness never goes out of style",16, 1616, 161616));
        instagram_users.add(new Instagram_User("4", "27", "following", "afshin", "Afshin Yarahmadi",
                "Living life on my own terms",17, 1717, 171717));
        instagram_users.add(new Instagram_User("4", "28", "follower", "neda", "Neda Noroozian",
                "I got to Where I am today by being me!",18, 1818, 181818));
        instagram_users.add(new Instagram_User("5", "29", "following", "farzad", "Farzad Fardin",
                "I was born to do exactly What i am doing today",19, 1919, 191919));
        instagram_users.add(new Instagram_User("5", "30", "follower", "rasool", "Rasool Baqeri",
                "Dont like me? Dont care!",20, 2020, 202020));
        instagram_users.add(new Instagram_User("5", "31", "following", "mehdi", "Mehdi Moshfeq",
                "Looking at the World through colored glasses",21, 2121, 212121));
        instagram_users.add(new Instagram_User("5", "32", "follower", "nila", "Nila Alikhani",
                "Dont study me.You wont graduate",22, 2222, 222222));
        instagram_users.add(new Instagram_User("6", "33", "following", "iman", "Iman Hoomehri",
                "I believe in being myself",23, 2323, 232323));
        instagram_users.add(new Instagram_User("6", "34", "follower", "bahar", "Bahar Rad",
                "Doing better",24, 2424, 242424));
        instagram_users.add(new Instagram_User("6", "35", "following", "yasaman", "Yasaman Mirhosseini",
                "Pretty & Profitable",25, 2525, 252525));
        instagram_users.add(new Instagram_User("6", "36", "follower", "ali", "Ali Panahian",
                "Life is beautiful...!",26, 2626, 262626));
        instagram_users.add(new Instagram_User("7", "37", "following", "farbod", "Farbod Razi",
                "Goal:bigger smile",27, 2727, 272727));
        instagram_users.add(new Instagram_User("7", "38", "follower", "bahare", "Bahare Khoshsima",
                "I see beauty in everything",28, 2828, 282828));
        instagram_users.add(new Instagram_User("7", "39", "following", "hajar", "Hajar Hosseini",
                "Glitter is the only option",29, 2929, 292929));
        instagram_users.add(new Instagram_User("7", "40", "follower", "shahab", "Shahab Marani",
                "Anything but predictable",30, 3030, 303030));
        instagram_users.add(new Instagram_User("8", "41", "following", "farzad", "Farzad Fahim",
                "So many of my smiles are because of you",31, 3131, 313131));
        instagram_users.add(new Instagram_User("8", "42", "follower", "shirin", "Shirin Dirbaz",
                "My life is better than my daydreams",32, 3232, 323232));
        instagram_users.add(new Instagram_User("8", "43", "following", "afshin", "Afshin Riahi",
                "Love and Peace",33, 3333, 333333));
        instagram_users.add(new Instagram_User("8", "44", "follower", "neda", "Neda Nabavimanesh",
                "Starting over!",34, 3434, 343434));
        instagram_users.add(new Instagram_User("9", "45", "following", "mahdis", "Mahdis Niazi",
                "I am Worthy of the greatness i hold",35, 3535, 353535));
        instagram_users.add(new Instagram_User("9", "46", "follower", "arash", "Arash Nikoo",
                "Love Without limits",36, 3636, 363636));
        instagram_users.add(new Instagram_User("9", "47", "following", "arian", "Arian Mehri",
                "Born to shine bright",37, 3737, 373737));
        instagram_users.add(new Instagram_User("9", "48", "follower", "mahro", "Mahro Layeqi",
                "Its not your job to like me,Its mine",38, 3838, 383838));
        instagram_users.add(new Instagram_User("10", "49", "following", "mehbod", "Mehbod Seddiq",
                "Together we could be unstoppable",39, 3939, 393939));
        instagram_users.add(new Instagram_User("10", "50", "follower", "amin", "Amin Kermani",
                "I'm not here to be average, I'm here to be the best.",40, 4040, 404040));
        instagram_users.add(new Instagram_User("10", "51", "following", "mahshid", "Mahshid Malekpoor",
                "I am so deep even the ocean gets jealous!!",41, 4141, 414141));
        instagram_users.add(new Instagram_User("10", "52", "follower", "fatemeh", "Fatemeh Askari",
                "In a world of darkness look up at the stars",42, 4242, 424242));
        return instagram_users;
    }
//*************This Method checks the username and password matching with previous information**********************************************************************
    public static User find_user(List<User> users, String username, String password)
    {
        User found_user = new User("-1", "", "", "");
        for (User user : users) {
            if (user.Username.equals(username) && user.Password.equals(password))
            {
                found_user = user;
                break;
            }
        }
        return found_user;
    }
}

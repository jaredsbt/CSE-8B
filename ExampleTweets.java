class User{
    String userName;
    String displayName;
    int followers;

    User(String userName, String displayName, int followers) {
        this.userName = userName;
        this.displayName = displayName;
        this.followers = followers; 
    }
    String toText() {
        return this.displayName + " @" + this.userName;
    }
}

class Tweet{
    String textTweet;
    int tweetLikes;
    String tweetID;
    User person; 

    Tweet(String textTweet, User person, int tweetLikes, String tweetID) {
        this.textTweet = textTweet;
        this.tweetLikes = tweetLikes;
        this.tweetID = tweetID;
        this.person = person;
    }

    boolean longerThan(Tweet other){
        return this.textTweet.length() > other.textTweet.length();
        }
    boolean moreLikes(Tweet other){
        return this.tweetLikes > other.tweetLikes;
    }

    String toText(){
        String text = "NAME: " + this.person.displayName + " @" + this.person.userName + " TEXT: " + this.textTweet + " LIKES: " + this.tweetLikes;
        return text;
    }
    String toLink(){
        String link = "https://twitter.com/" + this.person.userName + "/status/" + this.tweetID;
        return link;
    }
}

class ExampleTweets {
    User leadDev = new User("The_Led_Dev", "LeadDev", 27400);
    User ucsdEgineering = new User("UCSDJacobs", "UCSD Egineering", 13700);
    User kimberlyPrather = new User("kprather88", "Kimberly_Prather,_Ph.D.", 85900);

    //  First tweet: https://twitter.com/TheLeadDev/status/1618053218545680385?cxt=HHwWgoC-8Yq1vfQsAAAA . I could not represent the images, urls, the @links included in this tweet, the date and time it was posted.
    Tweet leadDevTweet = new Tweet("Great egineers don't need to be passionate about programming; they need to be able to find flow in their work", leadDev, 1, "1618053218545680385");

    //  Second Tweet: https://twitter.com/TheLeadDev/status/1617822453715161089?cxt=HHwWgsC-9ea81PMsAAAA . I could not represent the images, urls, the @links included in this tweet, the date and time it was posted.
    Tweet leadDevTweet2 = new Tweet("The balance of motivating your teammates and ensuring their hopes are realistic.", leadDev, 1, "161782245371516108");

    // first tweet: https://twitter.com/UCSanDiego/status/1601250326950076418?cxt=HHwWhICz5Yis5LgsAAAA . I could not represent the images, urls, the @links included in this tweet, the date and time it was posted.  
    Tweet ucsdEgineeringTweet = new Tweet("To kick off this season of giving, we've compiled a gift guide featuring products and experiences from @ucsdalumni, faculty, innovators, entrepreneurs and more. Take a look at our 2022 Triton Holiday Gift Guide here:", ucsdEgineering, 8, "1601250326950076418");

    // second tweet: https://twitter.com/UCSDJacobs/status/1606342029645991937?cxt=HHwWgsCijZbk78osAAAA .  I could not represent the images, urls, the @links included in this tweet, the date and time it was posted. Also, I could not us an apostrophe. 
    Tweet ucsdEgineeringTweet2 = new Tweet("As we pause to rest and recharge before jumping into more research and engineering education for the public good next year, were reflecting on all that our students, faculty, staff and partners accomplished in 2022. the holiday break, Tritons!", ucsdEgineering, 1, "1606342029645991937"); 

    // Tweet from Third User: https://twitter.com/kprather88/status/1616477072448458754?cxt=HHwWhMDUrafV8O4sAAAA . I could not represent the user who this tweet was replying to and the quotation marks ("") she used in the tweet.
    Tweet kimberlyPratherTweet = new Tweet(" 'Borderline unethical' to clean indoor air? Really?  Should we save $$ and not filter the water they drink too? Air filtration cleans air pollution (and viruses) out of their air. Everyone (not just the rich) is entitled to clean indoor air.  It is so hugely important to health.", kimberlyPrather, 205, "1616477072448458754");

    String leadFullName = this.leadDev.toText();
    String engineeringFullName = this.ucsdEgineering.toText();

    boolean strCmp1 = this.leadDevTweet.longerThan(leadDevTweet2);
    boolean strCmp2 = this.ucsdEgineeringTweet.longerThan(ucsdEgineeringTweet2);

    boolean likesCmp1 = this.leadDevTweet.moreLikes(leadDevTweet2);
    boolean likesCmp2 = this.ucsdEgineeringTweet.moreLikes(ucsdEgineeringTweet2);

    String tweetContent1 = this.leadDevTweet.toText();
    String tweetContent2 = this.ucsdEgineeringTweet.toText();

    String link1 = this.leadDevTweet.toLink();
    String link2 = this.ucsdEgineeringTweet.toLink();
}

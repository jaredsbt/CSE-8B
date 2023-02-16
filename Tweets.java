// import tester.*;

interface Tweet {
    public boolean isStartOfThreadBy(String author);
    public int totalLikes();
    public String unrollThread();
}

class TextTweet implements Tweet {
    String contents;
    int likes;
    String author;

    TextTweet(String contents, int likes, String author) {
        this.contents = contents;
        this.likes = likes;
        this.author = author;
    }

    public boolean isStartOfThreadBy(String author) {
        return this.author == author;
    }

    public int totalLikes() {
        return this.likes;
    }

    public String unrollThread() {
        return this.author + "\n" + this.likes + " likes" + "\n" + this.contents + "\n";
    }
}

class ReplyTweet implements Tweet {
    String contents;
    int likes;
    String author;
    Tweet replyTo;

    ReplyTweet(String contents, int likes, String author, Tweet replyTo) {
        this.contents = contents;
        this.likes = likes;
        this.author = author;
        this.replyTo = replyTo;
    }

    public boolean isStartOfThreadBy(String author) {
        return this.author.equals(author) && this.replyTo.isStartOfThreadBy(author); 
    }

    public int totalLikes() {
        return this.likes + this.replyTo.totalLikes();
    }

    public String unrollThread() {
        return this.replyTo.unrollThread() + this.author + "\n" + this.likes + " likes" + "\n" + this.contents + "\n";
    }
}

class Tweets {
    TextTweet cartiTweet = new TextTweet("love all my supporters it's time", 395300, "playboicarti"); // Source: https://twitter.com/playboicarti/status/1607111123802660866

    ReplyTweet prosreplyToCarti= new ReplyTweet("he rly said this and did nothing huh", 4, "Profineorjay", cartiTweet); // Source: https://twitter.com/Profineorjay/status/1620144744931393538 
    ReplyTweet renzysReplyToCarti = new ReplyTweet("you do not love us", 1633, "renzy", cartiTweet); // source: https://twitter.com/tize4PF/status/1621205471750127617 

    TextTweet lebronTweet = new TextTweet("Maybe It's Me", 428000, "LeBron James"); // Source: https://twitter.com/KingJames/status/1622394143912919041

    ReplyTweet randomReplyToLebron = new ReplyTweet("LeBron texts like a middle schooler", 20000, "anonymous", lebronTweet); // Made up tweet
    ReplyTweet astorsReplyToLebron = new ReplyTweet("U deserve better lakers need to make a trade asap", 12, "Astor", lebronTweet); // Source: https://twitter.com/AndrewAstor/status/1622441131551358976
    ReplyTweet coffeesReplyToLebron = new ReplyTweet("You are setting the record... for vulnerability", 60, "pourmecoffee", lebronTweet); // Source: https://twitter.com/pourmecoffee/status/1622397939271229440


//     boolean testisStartOfThreadBy(Tester t) {
//         return t.checkExpect(this.cartiTweet.isStartOfThreadBy("playboicarti"), true) &&
//                t.checkExpect(this.lebronTweet.isStartOfThreadBy("King James"), false);
//     }

//     boolean testtotalLikes(Tester t) {
//         return t.checkExpect(this.cartiTweet.totalLikes(), 395300) &&
//                t.checkExpect(this.lebronTweet.totalLikes(), 428000);
//     }

//     boolean testunrollThread(Tester t) {
//         return t.checkExpect(this.cartiTweet.unrollThread(), "playboicarti\n395300 likes\nlove all my supporters it's time\n") &&
//                t.checkExpect(this.lebronTweet.unrollThread(), "LeBron James\n428000 likes\nMaybe It's Me\n");
//     }

//     boolean testisStartOfThreadBy(Tester t) {
//         return t.checkExpect(this.prosreplyToCarti.isStartOfThreadBy("playboicarti"), true) &&
//                t.checkExpect(this.astorsReplyToLebron.isStartOfThreadBy("LeBron James"), true); 
//     }

//     boolean testtotalLikes(Tester t){
//         return t.checkExpect(this.renzysReplyToCarti.totalLikes(), 1633) &&
//                t.checkExpect(this.coffeesReplyToLebron.totalLikes(), 60); 
//     }

//     boolean testunrollThread(Tester t) {
//         return t.checkExpect(this.randomReplyToLebron.unrollThread(), "anonymous\n20000 likes\nLeBron texts like a middle schooler") &&
//                t.checkExpect(this.prosreplyToCarti.unrollThread(), "Profineorjay\n4 likes\nhe really said this and did nothing huh"); 
//     }
}
    
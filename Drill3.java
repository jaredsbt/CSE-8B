class TextTweet {
    String contents;
    int likes;

    TextTweet(String contents, int likes) {
        this.contents = contents;
        this.likes = likes;
    }

    boolean hasMention(String username) { 
        String newUsername = username + " ";
        int lengthOfName = newUsername.length();
        int atIndex = newUsername.indexOf("@");
        int excludeAt = atIndex + 1;
        String theUsername = username.substring(excludeAt, lengthOfName); 
        return this.contents.contains(theUsername);
    }

    boolean hasLike() {
        return this.likes >= 1;
    }

    String firstMention() {
        if(this.contents.indexOf(" ") != (this.contents.length() - 1) || (this.contents.length() <= 1)) {
            return " ";
        }
        return this.contents.substring(1, this.contents.length()+ 1);
    }
}

class ReplyTweet {
    TextTweet replyTo;
    String contents;
    int likes;

    ReplyTweet(TextTweet replyTo, String contents, int likes) {
        this.replyTo = replyTo;
        this.contents = contents;
        this.likes = likes;
    }

    boolean morePopularReply() {
        return this.replyTo.likes < this.likes;
    }

    int allLikes() {
        return this.replyTo.likes + this.likes;
    }

    boolean hasMention(String username) {
        String usernameWithAt = "@" + username;
        String firstUsernameWithAt = "@" + username + " ";
        String lastUsernameWithAt = " @" + username;
        // String userInBetween = " @" + username + " ";

        if(this.contents.equals(usernameWithAt) || this.replyTo.contents.equals(usernameWithAt)) {return true;}

    
        if(this.contents.contains(firstUsernameWithAt) || this.replyTo.contents.contains(firstUsernameWithAt)) {
            // int iOfSpace = this.contents.indexOf(" ");
            String check = this.contents.substring(0, usernameWithAt.length());
            String check2 = this.replyTo.contents.substring(0, usernameWithAt.length());
            return check.equals(usernameWithAt) || check2.equals(usernameWithAt);
        }

        if(this.contents.contains(lastUsernameWithAt) || this.replyTo.contents.contains(lastUsernameWithAt)) {
            int iOfSpace = this.contents.indexOf(" ");
            String check = this.contents.substring(iOfSpace + 1, usernameWithAt.length());
            int iOfSpace2 = this.replyTo.contents.indexOf(" ");
            String check2 = this.replyTo.contents.substring(iOfSpace2 + 1, usernameWithAt.length());
            return check.equals(usernameWithAt) || check2.equals(usernameWithAt);
        }
        return false;

        // if(this.contents.contains(userInBetween) || this.replyTo.contents.contains(userInBetween)) {
        //     int iOfSpace = this.contents.indexOf(" ");
        //     String check = this.contents.substring(iOfSpace +1, firstUsernameWithAt.length());
        //     return check.equals(usernameWithAt);
        // }

        // if(this.contents.contains(usernameWithAt) || this.replyTo.contents.contains(usernameWithAt)) {
        //     if(this.contents.contains(" ")) {
        //         int iOfUser = this.contents.indexOf(username);
        //         String name = this.contents.substring(iOfUser);
        //     }
        //     int iOfUser = this.contents.indexOf(username);
        //     int iOfAt = this.contents.indexOf("@");
        //     String check = this.contents.substring(iOfAt, iOfUser + 1);
        //     return check.equals(usernameWithAt);
            
    
    }
    // String cut = this.contents.substring(0, length)
    // this.contents.count("@") == 0 || this.contents.indexOf("@") == 0
}

// class Drill3 {
//     TextTweet example1 = new TextTweet("hello world", 333);

//     ReplyTweet reply = new ReplyTweet(example1, "hello", 0);

//     // ReplyTweet repl2 = new ReplyTweet(reply, "hello", 0);
// }
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
        String usernameWithAt = "@" + username + " ";
        if((this.contents.contains(usernameWithAt)) || (this.replyTo.contents.contains(usernameWithAt))){
            return true;
        } else {
            return false;
        }
    }
}

class Drill3 {
    TextTweet example1 = new TextTweet("hello world", 333);

    ReplyTweet reply = new ReplyTweet(example1, "hello", 0);

    // ReplyTweet repl2 = new ReplyTweet(reply, "hello", 0);
}
class TextTweet {
    String contents;
    int likes;

    TextTweet(String contents, int likes) {
        this.contents = contents;
        this.likes = likes;
    }

    boolean hasMention(String username) { 
        String newUsername = "@" + username;
        return this.contents.contains(newUsername);
        // int lengthOfName = newUsername.length();
        // int atIndex = newUsername.indexOf("@");
        // int excludeAt = atIndex + 1;
        // String theUsername = username.substring(excludeAt, lengthOfName); 
    }

    boolean hasLike() {
        return this.likes >= 1;
    }

    String firstMention() {
        if(this.contents.contains("@") && this.contents.contains(" ")) {
            int atIndex = this.contents.indexOf("@");
            int spaceIndex = this.contents.indexOf(" ");
            String firstMention = this.contents.substring(atIndex +1, spaceIndex);
            return firstMention;
        }
        return "";
        // if(this.contents.indexOf(" ") != (this.contents.length() - 1) || (this.contents.length() <= 1)) {
        //     return " ";
        // }
        // return this.contents.substring(1, this.contents.length()+ 1);
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

        if(this.contents.equals(usernameWithAt) || this.replyTo.contents.equals(usernameWithAt)) {return true;}

        return this.contents.contains(firstUsernameWithAt) || this.replyTo.contents.contains(firstUsernameWithAt) || this.contents.contains(lastUsernameWithAt) || this.replyTo.contents.contains(lastUsernameWithAt);       
    }
}

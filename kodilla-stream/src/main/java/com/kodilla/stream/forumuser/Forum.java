package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum(){
        theUserList.add(new ForumUser(1,"user1", 'M', 1982,8,28, 0));
        theUserList.add(new ForumUser(2,"user2", 'F', 1992,1,31,1));
        theUserList.add(new ForumUser(3,"user3", 'F', 1999,5,1,7));
        theUserList.add(new ForumUser(3,"user4", 'M', 1975,12,11,2));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theUserList);
    }


}

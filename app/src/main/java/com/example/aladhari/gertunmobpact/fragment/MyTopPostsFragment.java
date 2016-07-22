package com.example.aladhari.gertunmobpact.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * Created by aladhari on 22.07.2016.
 */
public class MyTopPostsFragment extends FragmentPostList {
    public MyTopPostsFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // [START my_top_posts_query]
        // My top posts by number of stars
        String myUserId = getUid();
        Query myTopPostsQuery = databaseReference.child("user-posts").child(myUserId)
                .orderByChild("starCount");
        // [END my_top_posts_query]

        return myTopPostsQuery;
    }
}

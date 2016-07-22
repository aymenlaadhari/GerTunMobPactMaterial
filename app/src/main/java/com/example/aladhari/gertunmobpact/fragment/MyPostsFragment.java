package com.example.aladhari.gertunmobpact.fragment;

/**
 * Created by aladhari on 22.07.2016.
 */
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyPostsFragment extends FragmentPostList {

    public MyPostsFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // All my posts
        return databaseReference.child("posts")
                .child("post-id");
    }
}
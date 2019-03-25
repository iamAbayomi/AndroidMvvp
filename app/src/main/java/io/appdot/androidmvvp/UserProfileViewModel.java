package io.appdot.androidmvvp;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import javax.inject.Inject;

public class UserProfileViewModel extends ViewModel {
    private String userId;
    private LiveData<User> user;
    private UserRepository userRepo;

    //Intructs Dagger 2 to provide the UserRepository parameter.
    @Inject
    public UserProfileViewModel(UserRepository userRepo){
        this.userRepo = userRepo;
    }

    public void init(String userID ){
        this.userId = userID;
    }

    public LiveData<User> getUser(){
        return user;
    }
}

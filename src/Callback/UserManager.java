package Callback;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserManager {
    private User[] userList = new User[50];

    int size = 0;

    void addUser (User user, AddUserCallback addUserCallback){
        userList[size] = user;
        size++;
        addUserCallback.onUserAdded(user);
    }

    void removeUser (User user, DeleteUserCallback deleteUserCallback){
        int j = -1;
        for (int i=0; i<size;i++){
            if (userList[i].equals(user)){
                j = i;
            }
        }
        if(j>0) {
            for (int i = j; i < (size - 1); i++) {
                userList[i] = userList[i + 1];
            }
            size--;
        }

        deleteUserCallback.onUserDeleted(user);
    }

    void displayAll (DisplayUsersCallback displayUsersCallback){
        for (int i = 0; i <size; i++){
            System.out.println(userList[i].getName()+", "+userList[i].getAge()+", "+userList[i].getEmail());
        }
        displayUsersCallback.onUsersDisplayed(userList);
    }


}

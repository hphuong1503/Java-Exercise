package Callback;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserProgram {
    public static void main(String[] args) {

        AddUserCallback addUserCallback = new AddUserCallback() {
            @Override
            public void onUserAdded(User user) {
                System.out.println(user.getName()+" duoc them vao");
            }
        };

        DisplayUsersCallback displayUsersCallback = new DisplayUsersCallback() {
            @Override
            public void onUsersDisplayed(User[] userList) {
                System.out.println("List user da duoc in ra");
            }
        };

        DeleteUserCallback deleteUserCallback = new DeleteUserCallback() {
            @Override
            public void onUserDeleted(User user) {
                System.out.println(user.getName()+" da duoc xoa");
            }
        };

        UserManager userManager = new UserManager();
        User[] user = new User[50];

//        String name;
//        int age;
//        String email;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhap ten: ");
//        name = scanner.next();
//        System.out.println("Nhap tuoi: ");
//        age = scanner.nextInt();
//        System.out.println("Nhap dia chi email: ");
//        email = scanner.next();
//        User example = new User(name, age, email);

        User a = new User("jack", 15, "jack123@gmail.com");
        User b = new User("emily", 18, "em1ly2408@gmail.com");
        User c = new User("richard", 24, "legolover170");
        User d = new User("oliver", 14, "garlicbr3ad@yahoo.com");
        User e = new User("tohill", 20, "bookiestores@yahoo.com");

        userManager.addUser(a, addUserCallback);
        userManager.addUser(b, addUserCallback);
        userManager.addUser(c, addUserCallback);
        userManager.addUser(d, addUserCallback);
        userManager.addUser(e, addUserCallback);

        userManager.displayAll(displayUsersCallback);
        System.out.println("-----------------------");
        userManager.removeUser(b, deleteUserCallback);
        userManager.displayAll(displayUsersCallback);


    }

    static void addUser (int size){
//        String name;
//        int age;
//        String email;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhap ten: ");
//        name = scanner.next();
//        System.out.println("Nhap tuoi: ");
//        age = scanner.nextInt();
//        System.out.println("Nhap dia chi email: ");
//        email = scanner.next();
//
//        UserManager.add
//

    }
}

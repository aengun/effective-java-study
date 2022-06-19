package study.객체;

public class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            return this.getId() == ((User)obj).getId();
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        User user1 = new User(10, "홍길동");
        User user2 = new User(10, "홍길동");
        System.out.println("user1.equals(user2): " + user1.equals(user2));
        System.out.println("user1.hashCode(): " + user1.hashCode());
        System.out.println("user2.hashCode(): " + user2.hashCode());
    }
}
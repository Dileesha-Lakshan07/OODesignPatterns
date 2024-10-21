class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }

    // Method to disconnect from the database
    public void disconnect() {
        System.out.println("Disconnecting from the database...");
    }
}

class Singleton {
    public static void main(String[] args) {
        DatabaseConnection obj = DatabaseConnection.getInstance();
        DatabaseConnection obj2 = DatabaseConnection.getInstance();

        obj.connect();
        obj.disconnect();
        System.out.println(obj == obj2);
    }
}
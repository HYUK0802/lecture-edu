package lectureedu.user;

public class UserDTO {

    private String userID;
    private String userPassword;
    private String userEmail;
    private String userEmailHash;
    private boolean userEmailChecked;

    public String getUserID() {
        return userID;
    }

    public UserDTO setUserID(String userID) {
        this.userID = userID;
        return this;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public UserDTO setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public UserDTO setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public String getUserEmailHash() {
        return userEmailHash;
    }

    public UserDTO setUserEmailHash(String userEmailHash) {
        this.userEmailHash = userEmailHash;
        return this;
    }

    public boolean isUserEmailChecked() {
        return userEmailChecked;
    }

    public UserDTO setUserEmailChecked(boolean userEmailChecked) {
        this.userEmailChecked = userEmailChecked;
        return this;
    }

    public UserDTO(){

    }

    public UserDTO(String userID, String userPassword, String userEmail, String userEmailHash, boolean userEmailChecked) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userEmailHash = userEmailHash;
        this.userEmailChecked = userEmailChecked;
    }
}

package lectureedu.likey;

public class LikeyDTO {
    String userID;
    int evaluationID;
    String userIP;

    public LikeyDTO() {

    }
    public LikeyDTO(String userID, int evaluationID, String userIP) {
        this.userID = userID;
        this.evaluationID = evaluationID;
        this.userIP = userIP;
    }

    public String getUserID() {
        return userID;
    }

    public LikeyDTO setUserID(String userID) {
        this.userID = userID;
        return this;
    }

    public int getEvaluationID() {
        return evaluationID;
    }

    public LikeyDTO setEvaluationID(int evaluationID) {
        this.evaluationID = evaluationID;
        return this;
    }

    public String getUserIP() {
        return userIP;
    }

    public LikeyDTO setUserIP(String userIP) {
        this.userIP = userIP;
        return this;
    }
}

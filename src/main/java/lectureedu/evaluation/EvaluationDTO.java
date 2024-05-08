package lectureedu.evaluation;

public class EvaluationDTO {

    int evaluationID;
    String userID;
    String lectureName;
    String professorName;
    int lectureYear;
    String semesterDivide;
    String lectureDivide;
    String evaluationTitle;
    String evaluationContent;
    String totalScore;
    String creditScore;
    String comfortableScore;
    String lectureScore;
    int likeCount;

    public EvaluationDTO() {

    }

    public EvaluationDTO(int evaluationID, String userID, String lectureName, String professorName, int lectureYear, String semesterDivide, String lectureDivide, String evaluationTitle, String evaluationContent, String totalScore, String creditScore, String comfortableScore, String lectureScore, int likeCount) {
        this.evaluationID = evaluationID;
        this.userID = userID;
        this.lectureName = lectureName;
        this.professorName = professorName;
        this.lectureYear = lectureYear;
        this.semesterDivide = semesterDivide;
        this.lectureDivide = lectureDivide;
        this.evaluationTitle = evaluationTitle;
        this.evaluationContent = evaluationContent;
        this.totalScore = totalScore;
        this.creditScore = creditScore;
        this.comfortableScore = comfortableScore;
        this.lectureScore = lectureScore;
        this.likeCount = likeCount;
    }

    public int getEvaluationID() {
        return evaluationID;
    }

    public EvaluationDTO setEvaluationID(int evaluationID) {
        this.evaluationID = evaluationID;
        return this;
    }

    public String getUserID() {
        return userID;
    }

    public EvaluationDTO setUserID(String userID) {
        this.userID = userID;
        return this;
    }

    public String getLectureName() {
        return lectureName;
    }

    public EvaluationDTO setLectureName(String lectureName) {
        this.lectureName = lectureName;
        return this;
    }

    public String getProfessorName() {
        return professorName;
    }

    public EvaluationDTO setProfessorName(String professorName) {
        this.professorName = professorName;
        return this;
    }

    public int getLectureYear() {
        return lectureYear;
    }

    public EvaluationDTO setLectureYear(int lectureYear) {
        this.lectureYear = lectureYear;
        return this;
    }

    public String getSemesterDivide() {
        return semesterDivide;
    }

    public EvaluationDTO setSemesterDivide(String semesterDivide) {
        this.semesterDivide = semesterDivide;
        return this;
    }

    public String getLectureDivide() {
        return lectureDivide;
    }

    public EvaluationDTO setLectureDivide(String lectureDivide) {
        this.lectureDivide = lectureDivide;
        return this;
    }

    public String getEvaluationTitle() {
        return evaluationTitle;
    }

    public EvaluationDTO setEvaluationTitle(String evaluationTitle) {
        this.evaluationTitle = evaluationTitle;
        return this;
    }

    public String getEvaluationContent() {
        return evaluationContent;
    }

    public EvaluationDTO setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent;
        return this;
    }

    public String getTotalScore() {
        return totalScore;
    }

    public EvaluationDTO setTotalScore(String totalScore) {
        this.totalScore = totalScore;
        return this;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public EvaluationDTO setCreditScore(String creditScore) {
        this.creditScore = creditScore;
        return this;
    }

    public String getComfortableScore() {
        return comfortableScore;
    }

    public EvaluationDTO setComfortableScore(String comfortableScore) {
        this.comfortableScore = comfortableScore;
        return this;
    }

    public String getLectureScore() {
        return lectureScore;
    }

    public EvaluationDTO setLectureScore(String lectureScore) {
        this.lectureScore = lectureScore;
        return this;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public EvaluationDTO setLikeCount(int likeCount) {
        this.likeCount = likeCount;
        return this;
    }
}

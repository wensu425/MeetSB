package cse110.com.meetsb.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import cse110.com.meetsb.AcademicInfoActivity;

public class User {

    private List<String> profilePictures;

    private String gender;

    private String description;

    private String userName;

    private String gpa;

    private String major;

    private HashMap<String, Integer> courseTakingOffsetMap;

    private int graduationYear;

    public String getUserName() { return userName; }

    public void setUserName(String userName) { this.userName = userName; }

    public List<String> getProfilePictures() { return profilePictures; }

    public void setProfilePictures( List<String> profilePictures) { this.profilePictures = profilePictures; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getGraduationYear() { return graduationYear; }

    public void setGraduationYear(int graduationYear) { this.graduationYear = graduationYear; }

    public String getMajor() { return major; }

    public void setMajor(String major) { this.major = major; }

    public String getGpa() { return gpa; }

    public void setGpa(String gpa) { this.gpa = gpa; }

    public HashMap<String, Integer> getCourseTakingOffsetMap() { return courseTakingOffsetMap; }

    public void setCourseTakingOffsetMap(HashMap<String, Integer> courseTakingOffsetMap) { this.courseTakingOffsetMap = courseTakingOffsetMap; }

    public User(){
        courseTakingOffsetMap = new HashMap<>();
    }

}

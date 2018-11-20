package Task2;

import java.io.Serializable;

public class Course  implements Serializable {
    public  String courseTitle;
    public  Textbook tb;
    public  Instructor ins;

    public Course(){
        courseTitle = "che tam";
        tb = null;
        ins = null;
    }

    public Course(String courseTitle, Textbook tb, Instructor ins)
    {
        this.courseTitle = courseTitle;
        this.ins = ins;
        this.tb = tb;
    }

    public Instructor getIns() {
        return ins;
    }

    public Textbook getTb() {
        return tb;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setIns(Instructor ins) {
        this.ins = ins;
    }

    public void setTb(Textbook tb) {
        this.tb = tb;
    }

    @Override
    public String toString() {
        return "Course name " + courseTitle;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Course)
        {
            Course course = (Course) obj;
            if(course.courseTitle == this.courseTitle )
            {
                return  true;
            }
        }
        return  false;
    }
}

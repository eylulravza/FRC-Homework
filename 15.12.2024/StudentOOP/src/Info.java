public class Info {
     String name;
     String gender;
     int age;
     int classno;
     int mathgrade;
     int sciencegrade;

    public Info(String name, String gender, int age, int classno, int mathgrade, int sciencegrade){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.classno = classno;
        this.mathgrade = mathgrade;
        this.sciencegrade = sciencegrade;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getClassno(){
            return classno;
    }

    public void setClassno(int classsno){
            this.classno = classno;
    }

    public int getMathgrade(){
        return mathgrade;
    }

    public void setMathgrade(int mathgrade){
        this.mathgrade = mathgrade;
    }

    public int getSciencegrade(){
        return sciencegrade;
    }

    public void setSciencegrade(int sciencegrade){
        this.sciencegrade = sciencegrade;
    }


    }

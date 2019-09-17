package com.mad.mad;

public class User
{

    //student
    private String id;
    private String index;
    private String name;
    private String email;
    private String phone;
    private String GPA;
    private String batch;
    private String password;


    // lecturer

    private String idLect;
    private String indexLect;
    private String nameLect;
    private String emailLect;
    private String passwordLect;



    //Student

    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id=id;
    }


    public String getIndex()
    {
        return index;
    }
    public void setIndex(String index)
    {
        this.index=index;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }


    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }


    public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone=phone;
    }


    public String getGPA()
    {
        return GPA;
    }
    public void setGPA(String GPA)
    {
        this.GPA=GPA;
    }


    public String getBatch()
    {
        return batch;
    }
    public void setBatch(String batch)
    {
        this.batch=batch;
    }


    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }



    //lecturer

    public String getLectId()
    {
        return idLect;
    }
    public void setLectId(String idLect) { this.idLect=idLect; }


    public String getLectIndex()
    {
        return indexLect;
    }
    public void setLectIndex(String indexLect) { this.indexLect=indexLect; }

    public String getLectName()
    {
        return nameLect;
    }
    public void setLectName(String nameLect)
    {
        this.nameLect=nameLect;
    }


    public String getLectEmail()
    {
        return emailLect;
    }
    public void setLectEmail(String emailLect)
    {
        this.emailLect=emailLect;
    }


    public String getLectPassword()
    {
        return passwordLect;
    }
    public void setLectPassword(String passwordLect)
    {
        this.passwordLect=passwordLect;
    }


}

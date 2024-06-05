import java.util.Date;

public class human {
    private String name;
    private String lastName;
    private Date birthday;

    public human(String name, String lastName, Date birthday) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString()
    {
        return this.name+" "+this.lastName+" д.р."+birthday;

    }

}

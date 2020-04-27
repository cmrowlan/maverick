package sample;

public class User {
    private String name;
    private String username;
    private String pwd;
    private String email;
    private String salt;

    public String getName(){
        return this.name;
    }
    public void setName(String _name){
        this.name = _name;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String _username) {
        this.username = _username;

    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String _email) {
        this.email = _email;

    }
    public String getSalt(){
        return this.salt;
    }
    public void setSalt(String _salt) {
        this.salt = _salt;

    }
    public String getPwd(){
        return this.pwd;
    }
    public void setPwd(String _pwd) {
        this.pwd = _pwd;

    }
}

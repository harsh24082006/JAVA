class get_method{
private String username;
private int age;
private int id;

public String getusername(){
return username;
}

public void setusername(String username){
this.username=username;
}

public int getage(){
return age;
}

public void setage(int age){
this.age=age;
}

public int getid(){
return id;
}

public void setid(int id){
this.id=id;
}


public static void main(String[] args){

get_method t= new get_method();

t.setusername("HARSHAL");
t.setage(21);
t.setid(510);

System.out.println(t.getusername());
System.out.println(t.getage());
System.out.println(t.getid());
}
}
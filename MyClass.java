class MyClass
{	

	enum rank{
	first, second, third;}


	rank var;
	
	public MyClass(rank var){
		this.var = var;	
}

public void your_rank(rank r){
	if(r == rank.first){System.out.println("winner");}
	else if(r == rank.second){System.out.println("Runnerup");}
	else{System.out.println("last");}
}

    public static void main(String[] args)
     {
	int a = 3;
	int b = 5;
	
	String str = "third";
	MyClass t1 = new MyClass(rank.valueOf(str));
	
	t1.your_rank(t1.var);
    }
}

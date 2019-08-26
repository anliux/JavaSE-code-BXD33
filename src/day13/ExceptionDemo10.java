/*
try catch finally组合方式

1、try catch：
   对代码进行异常检测，并对检测的异常传递给catch处理
   叫做：异常捕获处理。
   （注：有catch才叫捕获处理，没catch写try也没用）

void show()throws?//声明不声明需要看捕获的异常是否有处理方式
	//如果有，不声明；如果没有，要抛出的那种，就要声明。
{
	try
	{
		throw new Exception();
	}
	catch(Exception e)
	{
		try
		{
			throw e;
		}
		catch(Exception e)
		{
			....
		}
	}
}

2、try finally：
   对代码进行异常检测，检测到异常后，因为没有catch，所以一样会被默认jvm抛出
   叫做：异常没有捕获处理。
   但是功能所开启的资源需要进行关闭，所以有finally。
void show()
{
	
}

*/

class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

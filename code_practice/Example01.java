package com.apress.ch.one.hw;
import java.util.List;
public class Example01
{
	public static void main(String[] args)
	{
		List<String> items;
            items = List.of("1", "a", "2", "a", "3", "a");
		
		items.forEach(item ->
		{
			if (item.equals("a"))
			{
				System.out.printl("A");
			}
			else
			{
				System.out.printl("Not A");
			}
		});
	}
}

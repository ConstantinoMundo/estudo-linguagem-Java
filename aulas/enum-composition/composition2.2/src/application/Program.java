package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		Comment comment = new Comment("Have a nice trip");
		Comment comment1 = new Comment("Wow that's awesome!");

		Post post = new Post(
				LocalDateTime.parse("21/06/2018 13:05:44", formatter), 
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		
		post.addComment(comment);
		post.addComment(comment1);
		
		Comment comment2 = new Comment("Good night");
		Comment comment3 = new Comment("May the Force be with you");

		Post post1 = new Post(
				LocalDateTime.parse("28/07/2018 23:14:19", formatter), 
				"Good night guys",
				"See you tomororw",
				12);
		
		post1.addComment(comment2);
		post1.addComment(comment3);
		
		System.out.println(post);
		System.out.println(post1);
	}

}
package post;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import location.Location;
import user.User;

@Service
public class PostService {
	
	User user1 = new User(
			"u1", 
			"Jany", 
			"Lawrence",
			new Location("l1", "Lagos"),
			"Jany@gmail.com");
			
		User user2 = new User(
			"u2", 
			"Jadon", 
			"Mills",
			new Location("l2", "Asaba"),
			"Jadon@gmail.com");
			
		Post post1 = new Post(
			"p1",
			"01-Jan-19",
			user1,
		        "Its good to love and be loved");
			
		Post post2 = new Post(
			"p2",
		        "02-Jan-19",
			user2,
			"We all need someone");		
	
		List<Post> posts = new ArrayList<>(Arrays.asList(post1, post2));
	
	public List<Post> getAllPosts() {
		
		return posts;
	 
	  }
	
	public Post getPost(String id) {
		Post post = posts.stream()
				.filter(t -> id.equals(t.getId()))
				.findFirst()
				.orElse(null);
		return post;
	}

	public void addPost(Post post) {
		posts.add(post);
	}
	
	public void updatePost(String id, Post post) {

	    for(int i = 0; i < posts.size(); i++) {

		Post p = posts.get(i);

		if(p.equals(post)) {

		     posts.set(i, post);
		}
	    }
	}
	
}

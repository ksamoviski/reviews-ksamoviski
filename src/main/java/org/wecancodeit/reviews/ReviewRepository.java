package org.wecancodeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {


    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository() {
        Review musicReview = new Review(1L, "Album Review", "10.5.2020", "This is a review of an album",
                "/images/sunset.jpg", "music", "Content for review would go here.");
        Review bookReview = new Review(2L, "Book Review", "10.5.2020", "This is a review of a book",
                "/images/archer.jpg ", "book", "Content for review would go here.");
        Review artReview = new Review(3L, "Art Review", "10.5.2020", "This is a review of a work of art",
                " /images/rainbow.jpg", "art", "Content for review would go here.");

        reviewsList.put(musicReview.getId(), musicReview);
        reviewsList.put(bookReview.getId(),bookReview);
        reviewsList.put(artReview.getId(), artReview);

    }

    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}

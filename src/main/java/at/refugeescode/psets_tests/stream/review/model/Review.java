package main.stream.review.model;

import java.util.List;

public class Review {

    private String recipe;

    private Double rating;

    private List<String> feedback;

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public List<String> getFeedback() {
        return feedback;
    }

    public void setFeedback(List<String> feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Review{" +
                "recipe='" + recipe + '\'' +
                ", rating=" + rating +
                ", feedback=" + feedback +
                '}';
    }
}

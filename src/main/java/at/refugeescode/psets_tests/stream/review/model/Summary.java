package main.stream.review.model;

import java.util.List;

public class Summary {

    private List<String> topRatedReviews;

    private List<String> topFeedbackWords;

    public void setTopRatedReviews(List<String> topRatedReviews) {
        this.topRatedReviews = topRatedReviews;
    }

    public void setTopFeedbackWords(List<String> topFeedbackWords) {
        this.topFeedbackWords = topFeedbackWords;
    }

    public List<String> getTopRatedReviews() {
        return topRatedReviews;
    }

    public List<String> getTopFeedbackWords() {
        return topFeedbackWords;
    }
}
